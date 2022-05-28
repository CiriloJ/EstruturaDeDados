package aula6;

public class main {

	public static void main(String[] args) {
		
		LSE l = new LSE();
		Aluno aluno1 = new Aluno("Antonio", 35, 10);
		Aluno aluno2 = new Aluno("Joao", 20, 9.5);
		Aluno aluno3 = new Aluno("ze", 35, 10);
		Aluno aluno4 = new Aluno("maria", 20, 9.5);
		Aluno aluno5 = new Aluno("ana", 35, 10);
		Aluno aluno6 = new Aluno("Joana", 20, 9.5);
		
		
		l.insereInicio(aluno1);
		l.imprime();
		
		l.insereInicio(aluno2);
		l.imprime();
		
		l.insereFim(aluno3);
		l.imprime();
		
		l.insereFim(aluno4);
		l.imprime();
		
		l.insereFim(aluno5);
		l.imprime();
		
		l.remove(aluno2);
		l.imprime();
		
		l.remove(aluno4);
		l.imprime();
		
		/*IVetor vet = new Vetor();
		vet.adiciona(50);
		vet.adiciona(3.3);
		vet.adiciona("Um vetor que aceita de tudo");
		
		Aluno aluno1 = new Aluno("Antonio", 35, 10);
		
		vet.adiciona(aluno1);
		
		vet.imprime();*/
		
	}

}