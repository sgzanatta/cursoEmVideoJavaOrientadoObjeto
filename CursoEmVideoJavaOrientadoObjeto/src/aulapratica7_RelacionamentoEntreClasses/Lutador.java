package aulapratica7_RelacionamentoEntreClasses;

public class Lutador {
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	// ATRIBUTOS
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	//METODOS
	public void apresentar() {
		System.out.println("---------------------------------------");
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos");
		System.out.println(this.getAltura() + " m de altura");
		System.out.println("Pesando " + this.getPeso() + "Kg");
		System.out.println("Ganhou " + this.getVitorias());
		System.out.println("Perdeu " + this.getDerrotas());
		System.out.println("Empatou " + this.getEmpates());
	}
	
	public void status() {
		System.out.println(this.getNome());
		System.out.println("� um peso " + this.getCategoria());
		System.out.println(this.getVitorias() + " vit�rias");
		System.out.println(this.getDerrotas()+ " derrotas");
		System.out.println(this.getEmpates() + " empates"); 
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	//METODOS ESPECIAIS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (peso < 52.2) {
			categoria = "Inv�lido";
		} else if (peso <= 70.3) {
			categoria = "Leve";
		} else if (peso <= 83.9) {
			categoria = "M�dio";
		} else if (peso <= 120.2) {
			categoria = "Pesado";
		} else {
			categoria = "Inv�lido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
}
