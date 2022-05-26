package aula5;

public class main {

	public static void main(String[] args) {
		IVetor vet = new Vetor();
		vet.adiciona(50);
		vet.adiciona(3.3);
		vet.adiciona("Um vetor que aceita de tudo");
		
		Aluno aluno1 = new Aluno("Antonio", 35, 10);
		
		vet.adiciona(aluno1);
		
		vet.imprime();
		
	}

}
