package aulapratica4_MetodosGetterSetterConstrutor;

public class Aula04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		Caneta c1 = new Caneta("NIC", "Amarela", 0.5f);     // exemplos do metodo construtor
		c1.status();
		
		System.out.println("");
		
		Caneta c2 = new Caneta ("KKK", "Laranja", 1.5f);
		c2.status();
		
		System.out.println("");
		
		Computador cp2 = new Computador();  
		cp2.status();
		
		System.out.println("");
		
		Lapis l1 = new Lapis();            // Exemplo metodo setters
		l1.setCor("Preto");
		l1.setPonta(0.5f);
		l1.status();
		
		System.out.println("");            // Exemplo metodo getters
			
		Lapis l2 = new Lapis();
		System.out.println(l2.getCor());
		System.out.println(l2.getPonta());
		
	}

}