package aulapratica5_ExemploPraticoObjeitos_Banco;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public void estadoAtual() {
		System.out.println("---------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status " + this.getStatus());
		
	}
		
	
	public ContaBanco() {
		this.setSaldo(0); // saldo = 0;
		this.setStatus(false); // status = false;
	}

	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true); // status = true;
		if (tipo == "cc") {
			this.setSaldo(50); // igual Saldo = 50;
		} else if (tipo == "cp") {
			this.setSaldo(150); // igual Saldo = 150;
		}
		System.out.println("Conta aberta com sucesso!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta em débito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(float valor) {
		if (this.getStatus()) { // Status == true:
			this.setSaldo(this.getSaldo() + valor); // igual saldo = saldo + valor ; ou saldo += valor
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}

	public void sacar(float valor) {
		if (this.getStatus()) { // Status == true;
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor); // Saldo = Saldo - v
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada! ");
		}
	}
	
	public void pagarMensal() {
		int mensal = 0;
		
		if (this.getTipo() == "cc") {
			mensal = 12;
		} else if (this.getTipo() == "cp") {
			mensal = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - mensal);  // saldo = saldo - mensal
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		}else {
			System.out.println("Impossível pagar conta fechada!");
		}
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
