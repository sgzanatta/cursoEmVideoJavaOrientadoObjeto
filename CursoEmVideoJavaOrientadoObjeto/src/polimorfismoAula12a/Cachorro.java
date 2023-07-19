package polimorfismoAula12a;

public final class Cachorro extends Mamifero {	
	
	public void enterrarOsso() {
		System.out.println("Osso enterrado");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o rabo de alegria!");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}	
	
	
	
	
}
