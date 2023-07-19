package aulapratica9_ExercicioPoo;
//CONSTRUTOR 3° PASSO
public class Pessoa {
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
//ATRIBUTOS 1° PASSO
	private String nome;
	private int idade;
	private String sexo;
//METODOS	2° PASSO
	public void  fazerAniver() {
		this.idade++;
	}
//METODOS ESPECIAIS 4° PASSO
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
