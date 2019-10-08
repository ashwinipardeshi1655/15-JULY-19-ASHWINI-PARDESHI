package com.ust.usttyspringcore.beansauthor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAuthor {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("beansauthor.xml");
	AuthorBean author = (AuthorBean) context.getBean(AuthorBean.class);
	
	System.out.println(author.getName());
	author.getWriter().write();
	
	//AuthorBean author2 = context.getBean(AuthorBean.class);
	//author2.getWriter().write();

}
}
