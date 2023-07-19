package projetoFinalAula14b;

public class Gafanhoto extends Pessoa{
	//CONSTRUTOR
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);                    // construtores erdados da classe pessoa , que é a superclasse de gafanhoto
		this.login = login;
		                       
	}
	//ATRIBUTOS
	private String login;
	private int totAssistido;
	
	//METODOS  
	public void viuMaisUm() {
		this.setTotAssistido(this.getIdade() + 1);
	}

	public String getLogin() {
		return login;
	}
	

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	@Override
	public String toString() {
		return 	"Gafanhoto [" + super.toString()
				+ " login=" + login + ", totAssistido=" + totAssistido + "]";
	}
	
	
	
}

