package com.dr.web.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dr.biz.BlogsBiz;
import com.google.gson.Gson;
import com.dr.utils.UploadFileUtil;
import com.dr.utils.UploadFileUtil.UploadFile;


@Controller
public class BookController {
	private static final Log logger=LogFactory.getLog(BookController.class);
	
	private BlogsBiz blogsBiz;
	
	@Resource(name="blogsBizImpl")
	public void setBlogsBiz(BlogsBiz blogsBiz) {
		this.blogsBiz = blogsBiz;
	}
	
	
	@RequestMapping(value="login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="person")
	public String person(){
		return "person";
	}
	
	
	
	
	
	//测试。直接进入页面
	
	
	@RequestMapping(value="user/toMyBlog")
	public String toMyblog(){
		return "myBlog";
	}
	
	

	@RequestMapping(value="user/toEditBlog")
	public String toEditBlog(){
		return "editBlog";
	}
	
	
	
	

//	//http://localhost:8080/springMVC_douban1/listBook
//	@RequestMapping(value="/admin/listBook")
//	public String listBook(Model model){//model由spring在dispatcherServlet创建（request.setAttribute("model",model)），
//		//用di方式注入到这个listBook
//		//Model model=new Model();
//		//Request.setAttribute("model",model);
//		logger.info("listbook called...");
//		List<Books> bookList=this.booksBiz.getAllBooks();
//		model.addAttribute("bookList",bookList);
//		System.out.println(bookList);
//		return "listBookForm";
//	}
//	
//	@RequestMapping(value="/admin/toAddBookForm")
//	public String toAddBookForm(Model model){
//		logger.info("toAddBookForm called...");
//		List<Category> categoryList=this.booksBiz.getAllCategoies();
//		model.addAttribute("categories",categoryList);//
//		model.addAttribute("book", new Books());//在addBookForm页面中用了spring，所以多传一个对象与界面上标签绑定
//		return "addBookForm";
//	}
//	
//	private String pdfRootName="uploadPdfs";//"uploadPdfs";
//	
//	@RequestMapping(value="/admin/addBook")
//	public String addBook(HttpServletRequest request,@ModelAttribute Books book){//绑定
////		
////		System.out.println(request);
//		System.out.println("__________________________________");
//		System.out.println(book);
//		String pdfs="";
//		//上传
//		Map<String,UploadFile> map=UploadFileUtil.uploadFile(request, book.getPdfsUrl(), pdfRootName);
//		
//		for(Entry<String,UploadFile> entry:map.entrySet()){
//			UploadFile uploadFile=entry.getValue();
//			pdfs+=uploadFile.getNewFileUrl();
//		}
//		
//		
//		book.setPdfs(pdfs);
//		
//		logger.info("addBook called...");
//		
//		Category category=this.booksBiz.getCategory(book.getCategory().getCid());
//		
//		book.setCategory(category);
//		this.booksBiz.save(book);
//		//为什么redirect重定向而不是forward转发。
//		//转发的话，刷新会重复提交
//		return "redirect:/admin/listBook";
//	}
//	
//	
//	/**toEdit
//	 * 
//	 * @param model
//	 * @param id
//	 * @return
//	 */
//	@RequestMapping(value="/admin/toEditBookForm/{id}")
//	public String toEditBookForm(Model model,@PathVariable Long id){
//		logger.info("toEditBookForm called...");
//		List<Category> categories=this.booksBiz.getAllCategoies();
//		model.addAttribute("categories",categories);
//		Books books=this.booksBiz.get(id);
//		model.addAttribute("books", books);
//		return "editBookForm";
//	}
//	
//	/**Edit update
//	 * 
//	 * @param model
//	 * @param id
//	 * @return
//	 */
//	@RequestMapping(value="/admin/updateBook")
//	public String toEditBookForm(Books books){
//		logger.info("updateBook called...");
//		Category category=this.booksBiz.getCategory( books.getCategory().getCid() );
//		books.setCategory(category);
//		this.booksBiz.update(books);
//		return "redirect:/admin/listBook";
//	}
//
//	@RequestMapping(value="admin/login")
//	public String login(){
//		return "login";
//	}
//	
//	/**
//	 * login
//	 * @return
//	 */
//	@RequestMapping(value="/adminLogin")
//	public String adminLogin(@RequestParam String uname,@RequestParam String pwd,@RequestParam String validateCode,HttpSession session){
//		String randCode=(String) session.getAttribute("rand");
//		if(!validateCode.equals(randCode)){
//			session.setAttribute("errmsg", "验证码错误");
//			return "login";
//		}
//		InputStream inputStrem=this.getClass().getClassLoader().getResourceAsStream("adminLogin.properties");
//		Properties p=new Properties();
//		try {
//			p.load(inputStrem);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		if(p.getProperty("uname").equals(uname) && p.getProperty("pwd").equals(pwd)){
//			session.setAttribute("uname", uname);
//			return "redirect:/admin/listBook";
//		}else{
//			session.setAttribute("errmsg", "用户名或密码错误");
//			return "login";
//		}
//	}
//	/**toStudentListBook
//	 * 
//	 */
//	@RequestMapping(value="/toStudentListBook")
//	public String toStudentListBook(Model model){
//		logger.info("toStudentListBook called...");
//		List<Category> categories=this.booksBiz.getAllCategoies();
//		model.addAttribute("categories",categories);
//		List<Books> bookList=this.booksBiz.getAllBooks();
//		model.addAttribute("bookList",bookList);
//		return "studentBookListForm";
//	}
//	
//	
//	/**findBookByCategory
//	 * 
//	 */
//	@RequestMapping(value="/findBookByCategory/{cid}")
//	//@ResponseBody 指将返回的内容（String） 当成响应中实体部分的内容
//	public @ResponseBody String findBookByCategory(Model model,@PathVariable int cid){
//		logger.info("findBookByCategory called...");
//		List<Books> bookList=this.booksBiz.getBooksByCategory(cid);
//		Gson gson=new Gson();
//		return gson.toJson(bookList);
//	}
//	
//	
//	
//	
//	
//	/**toDetailBookForm
//	 * 
//	 * @param model
//	 * @param id
//	 * @return
//	 */
//	@RequestMapping(value="toDetailBookForm/{id}")
//	public String toDetailBookForm(Model model,@PathVariable Long id){
//		logger.info("toDetailBookForm called...");
//		//List<Category> categories=this.booksBiz.getAllCategoies();
//		//model.addAttribute("categories",categories);
//		Books books=this.booksBiz.get(id);
//		model.addAttribute("books", books);
//		return "detailBookForm";
//	}
}
