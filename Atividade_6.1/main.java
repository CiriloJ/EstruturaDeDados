package aula7;

public class main {

	public static void main(String[] args) {
		
		LDE l = new LDE();
		Noh n = new Noh(0);
		/*Aluno aluno1 = new Aluno("Antonio", 35, 10);
		Aluno aluno2 = new Aluno("Joao", 20, 9.5);
		Aluno aluno3 = new Aluno("ze", 28, 10);
		Aluno aluno4 = new Aluno("maria", 20, 9.5);
		Aluno aluno5 = new Aluno("ana", 30, 10);
		Aluno aluno6 = new Aluno("Joana", 20, 9.5);
		*/
		
		l.insereInicio(10);
		l.imprimeIniParaFim();
		
		l.insereInicio(20);
		l.imprimeIniParaFim();
		
		l.insereFim(30);
		l.imprimeIniParaFim();
		
		l.insereFim(40);
		l.imprimeIniParaFim();
		
		l.insereFim(50);
		l.imprimeIniParaFim();
		
		n=l.busca(30);
		
		l.remove(n);
		l.imprimeIniParaFim();
		
		//l.remove(aluno4);
		//l.imprimeIniParaFim();
		
		l.imprimeFimParaIni();
		
		n=l.busca(10);
		l.remove(n);
		l.imprimeIniParaFim();
	}

}