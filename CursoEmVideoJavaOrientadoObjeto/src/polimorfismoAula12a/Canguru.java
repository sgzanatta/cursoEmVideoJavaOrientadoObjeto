package polimorfismoAula12a;

public final class Canguru extends Mamifero  {
	
	public void usarBolsa() {
		System.out.println("Usando Bolsa para proteger o filhote");
	}
	
	@Override
	public void locomover() {
		System.out.println("Saltando em movimento");
	}
	
}
