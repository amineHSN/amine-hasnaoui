package cigma.pfe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.models.Client;
import cigma.pfe.presentation.ClientController;

public class MonApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrl = (ClientController) context.getBean("controller");
		Client clt = new Client("Anass");
		ctrl.save(clt);
	}
}
