package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Leandro");
		aluno1.setIdade(26);
		aluno1.setDataNasc("15/05/1995");
		
		Aluno aluno2 = new Aluno();
		
		System.out.println(aluno1.getNome());
	}
}
