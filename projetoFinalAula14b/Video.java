package projetoFinalAula14b;

public class Video implements AcoesVideo {
	//CONSTRUTOR
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 1;
		this.curtida = 0;
		this.reproduzindo = false;
	}
	//ATRIBUTOS
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtida;
	private boolean reproduzindo;
	
	
	//METODOS
	@Override
	public void play() {
		this.reproduzindo = true;
		
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
		
	}

	@Override
	public void like() {
		this.curtida++;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int nova; 
		nova =  ((this.avaliacao + avaliacao) / this.views);
		this.avaliacao = nova;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtida() {
		return curtida;
	}

	public void setCurtida(int curtida) {
		this.curtida = curtida;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public String toString() {
		return "titulo = " + titulo + 
				" avaliacao = " + avaliacao + 
				" views = " + views + 
				" curtida = " + curtida+ 
				" reproduzindo = " + reproduzindo + "\n";
	}


}
