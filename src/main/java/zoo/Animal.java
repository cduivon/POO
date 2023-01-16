package zoo;

public class Animal {
	
	private String nomAnimal;
	private TypeAnimal typeAnimal;

	public Animal(String n, TypeAnimal t) {
		this.nomAnimal = n;
		this.typeAnimal = t;
	}
	
	public String getNomAnimal() {
		return this.nomAnimal;
	}
	
	public TypeAnimal getTypeAnimal() {
		return this.typeAnimal;
	}
}
