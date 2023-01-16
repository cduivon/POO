package zoo;

import java.util.ArrayList;

public class Secteur {
	
	private TypeAnimal typeAnimauxDansSecteur;
	private ArrayList<Animal> animauxDansSecteur = new ArrayList<Animal>();
	
	public Secteur(TypeAnimal t) {
		this.typeAnimauxDansSecteur = t;
	}
	
	public void ajouterAnimal(Animal a) {
		this.animauxDansSecteur.add(a);
	}
	
	public int getNombreAnimaux() {
		return this.animauxDansSecteur.size();
	}
	
	public TypeAnimal obtenirType() {
		return this.typeAnimauxDansSecteur;
	}

}
