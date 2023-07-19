package projetoFinalAula14b;

public abstract class Pessoa {
	//CONSTRUTOR
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}
	//ATRIBUTOS
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float experiencia;
	
	//METODOS
	protected void ganharExp() {
		System.out.println("Ganhando Exp!");
	}

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

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + " idade=" + idade + " sexo=" + sexo + "\n experiencia=" + experiencia + "]";
	}
	
	
	
}


