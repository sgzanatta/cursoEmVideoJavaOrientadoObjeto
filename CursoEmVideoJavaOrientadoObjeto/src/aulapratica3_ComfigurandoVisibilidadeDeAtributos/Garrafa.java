package aulapratica3_ComfigurandoVisibilidadeDeAtributos;

public class Garrafa {
	
	private String material;
	private String marca;
	private String protecao;
	private int litros;
	
	
	public Garrafa(String material, String marca, String protecao, int litros) {
		this.material = material;
		this.marca = marca;
		this.protecao = protecao;
		this.litros = litros;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProtecao() {
		return protecao;
	}

	public void setProtecao(String protecao) {
		this.protecao = protecao;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

}
