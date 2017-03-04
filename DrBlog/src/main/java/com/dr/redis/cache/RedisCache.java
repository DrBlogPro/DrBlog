package com.dr.redis.cache;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.ibatis.cache.Cache;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import redis.clients.jedis.Jedis;

public class RedisCache implements Cache{
	//日志对象
	private static Logger logger = LogManager.getLogger(RedisCache.class); 
	//对象的编号
	private String id;  
	
    private Jedis redisClient = createReids();  
    //用于同步的锁    
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();   
      
      
    public RedisCache(final String id) {    
        if (id == null) {  
            throw new IllegalArgumentException("Cache instances require an ID");  
        }  
        logger.debug("create an cache instance with id=:"+id);  
        this.id = id;  
    }   
    //jedis从连接池中取
    public static Jedis createReids(){ 
    	//TODO:获取jedis的实例 -> 这个地址要变
    	//Jedis jedis = new Jedis("127.0.0.1");
        Jedis jedis = RedisPool.getPool().getResource();  
        return jedis; 
    } 
    //获取当前缓存的id
    @Override  
    public String getId() {  
        return this.id;  
    }  
    
    @Override  
    public void putObject(Object key, Object value) { 
    	byte[] keybyte = SerializableUtil.serialize(key);
    	byte[] valuebyte = SerializableUtil.serialize(value);
    	this.redisClient.set(keybyte, valuebyte);
    }  
    //通过key到缓存redis中取值
    @Override  
    public Object getObject(Object key) {  
    	//缓存穿透
    	byte[] values = this.redisClient.get(SerializableUtil.serialize(key));
    	if(values == null){
    		return null;
    	}
    	Object obj = SerializableUtil.unSerialize(values);
    	return obj;
    } 
    
    @Override  
    public Object removeObject(Object key) {  
    	byte[] keybyte = SerializableUtil.serialize(key);
    	return this.redisClient.expire(keybyte,0);  
    }  
    //将缓存中的数据删除，实际上就是清空redis中的数据
    @Override  
    public void clear() {  
    	this.redisClient.flushDB();  
    }  
    @Override  
    public int getSize() {  
    	Long size = this.redisClient.dbSize();
    	int s = Integer.valueOf(size+"");
        return s;  
    }  
  
    @Override  
    public ReadWriteLock getReadWriteLock() {  
        return readWriteLock;  
    }  
    
}
