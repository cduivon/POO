package zoo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpringJava {
	public static void main(String args[]) throws Exception {
		
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IZooService iService = (IZooService) ac.getBean(IZooService.class);
		
		iService.funAjouterSecteur(TypeAnimal.AIGLE);
		iService.funSetNbVisiteursMaxParSecteur(12);
		iService.funNouveauVisiteur();
		System.out.println(iService.funGetVisiteurs());
	}
	
	
}
