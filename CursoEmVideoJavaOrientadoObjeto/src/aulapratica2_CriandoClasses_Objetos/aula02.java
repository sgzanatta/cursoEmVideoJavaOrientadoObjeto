package aulapratica2_CriandoClasses_Objetos;

public class aula02 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.carga = 90;
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		System.out.println("");
		
		Caneta c2 = new Caneta();
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		c2.ponta = 1.0f;
		c2.carga = 57;
		c2.destampar();
		c2.status();
		c2.rabiscar();
			
	}

}
