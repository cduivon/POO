package zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ZooService implements IZooService {
	
	@Autowired
	
	IZooDao zooDao;
	
	public int funGetVisiteurs() {
		return zooDao.getVisiteurs();
	}
	
	public void funSetNbVisiteursMaxParSecteur(int n) {
		zooDao.setNbVisiteursMaxParSecteur(n);
	}
	
	public void funAjouterSecteur(TypeAnimal t) {
		zooDao.ajouterSecteur(t);
	}
	
	public void funNouveauVisiteur() throws LimiteVisiteurException {
		zooDao.nouveauVisiteur();
	}
	
	public int funGetLimiteVisiteur() {
		return zooDao.getLimiteVisiteur();
	}
	
	public void funNouvelAnimal(Animal a) {
		zooDao.nouvelAnimal(a);
	}
	
	public int funNombreAnimaux() {
		return zooDao.nombreAnimaux();
	}

	public IZooDao getZooDao() {
		return zooDao;
	}

	public void setZooDao(IZooDao zooDao) {
		this.zooDao = zooDao;
	}
	
	

}
