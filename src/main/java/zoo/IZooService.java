package zoo;

public interface IZooService {
	
	public int funGetVisiteurs();
	
	public void funSetNbVisiteursMaxParSecteur(int n);
	
	public void funAjouterSecteur(TypeAnimal t);
	
	public void funNouveauVisiteur() throws LimiteVisiteurException;
	
	public int funGetLimiteVisiteur();
	
	public void funNouvelAnimal(Animal a);
	
	public int funNombreAnimaux();

}
