package aulapratica9_ExercicioPoo;
// 5° PASSO IMPLEMENTAR INTERFACE "implements Publicacao"
public class Livro implements Publicacao {
	
	//CONSTRUTOR 3° PASSO
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.leitor = leitor;
	}
	//ATRIBUTOS 1° PASSO
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//METODOS 2° PASSO   OBS: NA FRENTE DE CADA VIRGULA COLOQUE UM \n para ter quebra de linha
	public String detalhes() {
		return "Livro titulo = " + titulo + "\n, autor = " + autor + "\n, totPaginas = " + totPaginas + ", pagAtual = " + pagAtual
				+ "\n, aberto = "  + aberto + "\n, leitor = " + leitor.getNome() + ", idade = " + leitor.getIdade() + 
				", sexo = " + leitor.getSexo() + "\n ----------------------------------------";
	}
	//METODOS ESPECIAIS 4° PASSO
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	@Override
	public void abrir() {
		this.aberto = true;	
	}
	@Override
	public void fechar() {
		this.aberto = false;
	}
	@Override
	public void folhear(int pagina) {
		if (pagina > this.totPaginas) {
			this.pagAtual = 0;
		} else {
			this.pagAtual = pagina;
		}
	}
	@Override
	public void avancarPag() {
		this.pagAtual++;	
	}
	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
	
}
