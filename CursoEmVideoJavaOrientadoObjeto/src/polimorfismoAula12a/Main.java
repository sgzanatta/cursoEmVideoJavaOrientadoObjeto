package polimorfismoAula12a;

public class Main {

	public static void main(String[] args) {
		Canguru c = new Canguru();
		c.alimentar();
		c.usarBolsa();
		c.locomover();
		
		Cobra c1 = new Cobra();
		
		c1.alimentar();
		c1.setCorEscama("verde");
		System.out.println(c1.toString());
		System.out.println(c1.getCorEscama());
		
		
	
	
		
	}

}
