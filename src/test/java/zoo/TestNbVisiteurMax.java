package zoo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class TestNbVisiteurMax {
	
	@Test
	void test() {
		
		assertThrows(LimiteVisiteurException.class, ()->{
			Zoo zoo = new Zoo();
			zoo.setNbVisiteursMaxParSecteur(2);
			zoo.ajouterSecteur(TypeAnimal.AIGLE);
		
			zoo.nouveauVisiteur();
			zoo.nouveauVisiteur();
			zoo.nouveauVisiteur();
		});
	}
}
