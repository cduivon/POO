package zoo;

public class App {
	
	private Zoo zoo;
	
	public App(Zoo z) {
		this.zoo = z;
	}

	public static void main(String[] args) throws Exception {
		App app = new App(new Zoo());
		
		app.zoo.setNbVisiteursMaxParSecteur(15);
		
		Chien a1 = new Chien("Fido");
		Chat a2 = new Chat("Gaturo");
		
		Animal a3 = new Animal("Marguerite", TypeAnimal.VACHE);
		Animal a4 = new Animal("Buck", TypeAnimal.LOUP);
		
		app.zoo.ajouterSecteur(TypeAnimal.LOUP);
		
		app.zoo.nouvelAnimal(a4);
		app.zoo.nouvelAnimal(a1);
		app.zoo.nouvelAnimal(a2);
		app.zoo.nouvelAnimal(a3);
		
		app.zoo.nouveauVisiteur();
		
		System.out.println(app.zoo.getVisiteurs());
		app.zoo.nouveauVisiteur();
		System.out.println(app.zoo.getVisiteurs());
		
		
	}

}
