package Test;




import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {
	
	@Test
	public void testSpring1() {

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(ac);
	}
	
	
	
	
	
//	@Test
//	public void testSpring2() {//???
//
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		BooksBiz bb=ac.getBean("booksBizImpl",BooksBiz.class);
//		List<Category> list=bb.getAllCategoies();
//		System.out.println("aaa");
////		for(Category c:list){
////			System.out.println(c);
////		}
//	}
//	
//	@Test
//	public void testSpring3() {
//
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		BookRank br=(BookRank) ac.getBean("BookRank");
//		System.out.println("aaa");
////		for(Category c:list){
////			System.out.println(c);
////		}
//	}
//		
	
	
//	@Test
//	public void testSpring0() {
//
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		BooksBiz bb=ac.getBean("booksBizImpl",BooksBiz.class);
//		Books b=new Books();
//		b.setAuthor("Jamas");
//		b.setIsbn("123-456-789");
//		BigDecimal bd=new BigDecimal(3.4);
//		b.setPrice(bd);
//		b.setTitle("c++语言瞎塔马讲");
//		Category c=new Category();
//		c.setCid(2);
//		b.setCategory(c);
//		
//		b=bb.save(b);
//		System.out.println(b);
////		for(Category c:list){
////			System.out.println(c);
////		}
//	}
	
	
	
}
