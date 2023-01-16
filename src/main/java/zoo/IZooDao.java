package zoo;


public interface IZooDao {
	
	public int getVisiteurs();
	
	public void setNbVisiteursMaxParSecteur(int n);
	
	public void ajouterSecteur(TypeAnimal t);
	
	public void nouveauVisiteur() throws LimiteVisiteurException;
	
	public int getLimiteVisiteur();
	
	public void nouvelAnimal(Animal a);
	
	public int nombreAnimaux();
}
