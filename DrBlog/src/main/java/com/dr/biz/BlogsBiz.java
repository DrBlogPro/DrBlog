package com.dr.biz;

import java.util.List;

import com.dr.bean.Blog;
import com.dr.bean.Tags;

public interface BlogsBiz {
	
	List<Blog> getHotBlogs();//按热度获取blog列表，先不写
	
	List<Tags> getRandomTags();//获取部分随机标签，用于首页展示,tags表
	
	List<Tags> getAllTags();//获取全部标签？,tags
	
	List<Blog> getHotBlogsByTags();//按标签获取最热blog，先不写
	
	List<Blog> getAttentionBlog();//获取关注人最新发表blog,按时间
	
	List<Blog> getMyBlogs();//获取我写的博客,按时间
	
	List<Blog> getMyForward();//获取我转发过的blog，即我的blog中olduser不为空的
	

	
	
	//只能搜索公开的blog
	List<Blog> getBlogsBySearchUser();//按用户搜索blog
	
	List<Blog> getBlogsByWord();//按关键字（标题）搜索，正则
	
	List<Blog> getCollectBlogs();//收藏列表
	
	List<Blog> getBlogsByFolder();//文件夹分类blog
	
	void classBlog();//分类blog
	
	void goodBlog();//点赞
	
	void badBlog();//踩
	
	void moneyBlog();//打赏
	
	void hotBlog();//根据顶踩打赏,更改blog的hot值
	
	void reportBlog();//举报blog,修改report表
	
	void deleteBlog();//删除blog
	
	void browseBlog();//增加浏览量
	
	void collectBlog();//收藏他人blog,收藏即放入一个默认的个人(收藏)文件夹
	
	
	
	
	/*
	 * redis
	List<Blog> getBlogGood();//获取我顶过的blog
	List<Blog> getBlogBad();//获取我踩过的blog
	List<Blog> getBlogMoney();//获取我打赏过的blog
	List<Blog> getBlogBrowse();//获取浏览记录
	*/
	
	
	
	
	void forwardBlog();//转发。类似于写blog，olduser为空
	
	void editBlog();//写blog，先不写


}
