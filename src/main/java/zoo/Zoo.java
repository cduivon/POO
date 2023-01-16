package zoo;

import java.util.ArrayList;

public class Zoo {
	
	private int visiteurs;
	private ArrayList<Secteur> secteursAnimaux = new ArrayList<Secteur>();
	private int nbVisiteurMaxParSecteur;
	
	public int getVisiteurs() {
		return this.visiteurs;
	}
	
	public void setNbVisiteursMaxParSecteur(int n) {
		this.nbVisiteurMaxParSecteur = n;
	}
	
	public void ajouterSecteur(TypeAnimal t) {
		secteursAnimaux.add(new Secteur(t));
	}
	
	public void nouveauVisiteur() throws LimiteVisiteurException {
		if(this.visiteurs < this.getLimiteVisiteur()) {
			this.visiteurs = this.visiteurs + 1;
		}
		else {
			throw new LimiteVisiteurException("La limite de visiteur est déjà atteinte");
		}
	}
	
	public int getLimiteVisiteur() {
		return nbVisiteurMaxParSecteur * secteursAnimaux.size();
	}
	
	public void nouvelAnimal(Animal a) {
		
		boolean present = false;
		
		for(int i = 0; i<secteursAnimaux.size(); i++) {
			if (secteursAnimaux.get(i).obtenirType() == a.getTypeAnimal()) {
				present = true;
				secteursAnimaux.get(i).ajouterAnimal(a);
			}
		}
		
		if(!present) {
			this.ajouterSecteur(a.getTypeAnimal());
			this.nouvelAnimal(a);
		}
	}
	
	public int nombreAnimaux() {
		int tot = 0;
		
		for(int i = 0; i < secteursAnimaux.size(); i++) {
			tot = tot + secteursAnimaux.get(i).getNombreAnimaux();
		}
		
		return tot;
	}

}
