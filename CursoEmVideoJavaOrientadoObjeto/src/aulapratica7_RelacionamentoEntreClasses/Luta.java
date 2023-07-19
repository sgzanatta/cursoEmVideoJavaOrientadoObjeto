package aulapratica7_RelacionamentoEntreClasses;

import java.util.Random;

public class Luta {
	// ex de agrega��o de classe
	private Lutador desafiado, desafiante;
	private int rounds;
	private boolean aprovada;

	// METODOS
	public void marcarLuta(Lutador l1, Lutador l2) {

		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) { // equals significa igual substitui "=="
			this.aprovada = true; // ex: l1.getCategoria() == L2.getCategoria
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	public void lutar() {
		if (this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();

			Random aleatorio = new Random();

			int vencedor = aleatorio.nextInt(3); // 0 1 2
			System.out.println("====== RESULTADO DA LUTA ======");
			switch (vencedor) {
			case 0: // EMPATE
				System.out.println("LUTA EMPATADA");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;

			case 1: // Desafiado vence
				System.out.println("Vitoria do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;

			case 2: // Desafiante vence
				System.out.println("Vitoria do " + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;		
			}
			System.out.println("========================");	
		} else {
			System.out.println("Luta n�o pode acontecer!!!");
		}
	}

	// METODOS ESPECIAIS
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
