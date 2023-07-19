  package projetoFinalAula14b;

public class Visualizacao {
	//CONSTRUTOR
	public Visualizacao(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		
		
	}
	//ATRIBUTOS
	private Gafanhoto espectador;
	private Video filme;
	
	
	//METODOS
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porc) {
		int tot = 0;
		if (porc <= 20) {
			tot = 3;
		} else if (porc <= 50) {
			tot = 5;
		} else if (porc <= 90) {
			tot = 8;
		} else {
			tot = 10;
		}
		this.filme.setAvaliacao(tot);
	}
	//METODOS ESPECIAIS
	public Gafanhoto getEspectador() {
		return espectador;
	}
	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}
	
	//toSTRING
	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
	
	
}