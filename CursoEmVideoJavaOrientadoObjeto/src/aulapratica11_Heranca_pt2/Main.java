package aulapratica11_Heranca_pt2;

public class Main {

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa();
		/*Visitante v1 = new Visitante ();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("Masculino");
		System.out.println(v1.toString()); */
		
		Aluno a1 = new Aluno();
		a1.setNome("Cl�udio");
		a1.setMatricula(1111);
		a1.setCurso("Inform�tica");
		a1.setIdade(16);
		a1.setSexo("Masculino");
		a1.PagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("Masculino");
		b1.PagarMensalidade();
	}

}
