package aulapratica5_ExemploPraticoObjeitos_Banco;

public class Aula05 {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.abrirConta("cc");
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.depositar(150);
		
		
		
		ContaBanco p2 = new ContaBanco();
		p2.abrirConta("cp");
		p2.setNumConta(2222);
		p2.setDono("Creuza");
		p2.depositar(150);
		p2.sacar(100);
		
		
		// açoes
		
		
		p1.estadoAtual();
		p2.estadoAtual();
	}

}
