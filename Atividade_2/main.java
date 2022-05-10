
public class main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Antonio", 35, 10);
		Aluno aluno2 = new Aluno("Joao", 20, 9.5);
		
		Vetor vetAlunos = new Vetor();
		vetAlunos.adiciona(aluno1);
		vetAlunos.adiciona(aluno2);
		vetAlunos.tamanho();
	}

}
