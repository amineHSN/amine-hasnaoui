package ma.gov.tp8;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ma.gov.tp8.controllers.ClientController;
import ma.gov.tp8.models.Client;


public class MonApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctr = (ClientController) ctx.getBean("ctrl");



	}
}
