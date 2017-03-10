package com.dr.biz.impl;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.dr.bean.Blog;
import com.dr.bean.Tags;
import com.dr.biz.BlogsBiz;
import com.dr.dao.BaseDao;

@Service
public class BlogsBizImpl implements BlogsBiz {
	private BaseDao basedao;
	
	@Resource(name="baseDaoMybatisImpl")
	public void setBasedao(BaseDao basedao) {
		this.basedao = basedao;
	}


	@Override
	public List<Blog> getAttentionBlog() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getMyBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getBlogsBySearchUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getBlogsByWord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getCollectBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getBlogsByFolder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void classBlog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goodBlog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void badBlog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moneyBlog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editBlog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportBlog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBlog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Blog> getHotBlogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tags> getRandomTags() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tags> getAllTags() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getHotBlogsByTags() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> getMyForward() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void hotBlog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void browseBlog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collectBlog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forwardBlog() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
//	@Override
//	public List<Category> getAllCategoies() {
//		List<Category> list=this.basedao.findAll(new Category(), "getAllCategory");
//		return list;
//	}
//
//	@Override
//	public Category getCategory(int id) {
//		Category c=new Category();
//		c.setCid(id);
//		List<Category> list=this.basedao.findAll(c,"getCategory");
//		return list != null && list.size() > 0 ? list.get(0) : null;//传回的是啥？？？
//	}
//
//	@Override
//	public List<Books> getAllBooks() {
//		List<Books> list=this.basedao.findAll(new Books(), "getAllBooks");
//		return list;
//	}
//
//	@Override
//	public Books save(Books books) {
//		this.basedao.add(books, "saveBook");
//		return books;
//	}
//
//	@Override
//	public Books update(Books books) {
//		this.basedao.update(books, "updateBook");
//		return books;
//	}
//
//	@Override
//	public Books get(Long id) {
//		Books b=new Books();
//		b.setBid(id);
//		List<Books> list=this.basedao.findAll(b,"getBook");
//		return list!=null && list.size()>0 ? list.get(0):null;
//	}
//
//	@Override
//	public void makeScores(Books books) {
//		BookRank br=new BookRank();
//		br.setBooks(books);
//		br.setIp(books.getBookrank().getIp());
//		br.setRid(books.getBookrank().getRid());
//		br.setScores(books.getBookrank().getScores());
//		this.basedao.add(br, "makeScores");
//	}
//
//
//	@Override
//	public List<Books> getBooksByCategory(int cid) {
//		if(cid<=0){
//			return getAllBooks();
//		}
//		Category category=new Category();
//		category.setCid(cid);
//		Books books=new Books();
//		books.setCategory(category);
//		List<Books> list=this.basedao.findAll(books, "getBooksByCategory");
//		return list;
//	}
}
