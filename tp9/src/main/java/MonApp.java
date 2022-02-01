
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controllers.ClientController;
import models.CarteFidelio;
import models.Client;
import models.Facture;
import models.Promotion;

public class MonApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctr = (ClientController) ctx.getBean("ctrl");
		Client client = new Client("OMAR");
		List<Facture> factures = Arrays.asList(new Facture(1500.0, "facture1"), new Facture(2000.0, "facture2"));
		client.setFactures(factures);
		//ctr.save(client);
		
		Client client1 = new Client("ahlam");
		List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new
		Promotion("solde 40%"));
		client.setPromotions(promotions);
		//ctr.save(client1);
		Client client2 = new Client("OMAR");
		CarteFidelio carteFidelio = new CarteFidelio("A29930489");
		carteFidelio.setClient(client);
		client.setCarteFidelio(carteFidelio);
		ctr.save(client2);



	}
}