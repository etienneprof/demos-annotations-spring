package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bo.couplagefaible.Musicien;

public class ApplicationAvecSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Musicien musicien = context.getBean("mus", Musicien.class);
		musicien.jouer();
		((ClassPathXmlApplicationContext) context).close();
	}
}
