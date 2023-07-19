package aulapratica4_MetodosGetterSetterConstrutor;

public class Lapis {
	private String cor;
	private float ponta;
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public void status() {
		System.out.println("Cor : " + this.cor);
		System.out.println("Ponta : " + this.ponta);
	}
	
	
}
