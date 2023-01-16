package zoo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	

	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		
		IZooService iService = (IZooService) context.getBean("ZooService");
		
		iService.funAjouterSecteur(TypeAnimal.AIGLE);
		iService.funSetNbVisiteursMaxParSecteur(12);
		iService.funNouveauVisiteur();
		iService.funGetVisiteurs();
		
		
		
		
	}

}
