package aula7;

public class main {

	public static void main(String[] args) {
		
		LDE l = new LDE();
		Aluno aluno1 = new Aluno("Antonio", 35, 10);
		Aluno aluno2 = new Aluno("Joao", 20, 9.5);
		Aluno aluno3 = new Aluno("ze", 28, 10);
		Aluno aluno4 = new Aluno("maria", 20, 9.5);
		Aluno aluno5 = new Aluno("ana", 30, 10);
		Aluno aluno6 = new Aluno("Joana", 20, 9.5);
		
		
		l.insereInicio(aluno1);
		l.imprimeIniParaFim();
		
		l.insereInicio(aluno2);
		l.imprimeIniParaFim();
		
		l.insereFim(aluno3);
		l.imprimeIniParaFim();
		
		l.insereFim(aluno4);
		l.imprimeIniParaFim();
		
		l.insereFim(aluno5);
		l.imprimeIniParaFim();
		
		l.remove(aluno2);
		l.imprimeIniParaFim();
		
		//l.remove(aluno4);
		//l.imprimeIniParaFim();
		
		l.imprimeFimParaIni();
		
		/*IVetor vet = new Vetor();
		vet.adiciona(50);
		vet.adiciona(3.3);
		vet.adiciona("Um vetor que aceita de tudo");
		
		Aluno aluno1 = new Aluno("Antonio", 35, 10);
		
		vet.adiciona(aluno1);
		
		vet.imprime();*/
		
	}

}