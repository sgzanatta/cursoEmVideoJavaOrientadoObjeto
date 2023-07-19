package aulapratica10_Heranca;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniversario() {
		this.idade++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIndade() {
		return idade;
	}

	public void setIndade(int indade) {
		this.idade = indade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
}
