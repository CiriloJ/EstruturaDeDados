
public class Main {
	public static void main(String[] args) {
		FilaVet fila= new FilaVet(5);
		
		
		Aluno aluno1 = new Aluno("Antonio", 35, 10);
		Aluno aluno2 = new Aluno("Joao", 20, 9.5);
		Aluno aluno3 = new Aluno("ze", 35, 10);
		Aluno aluno4 = new Aluno("maria", 20, 9.5);
		Aluno aluno5 = new Aluno("ana", 35, 10);
		Aluno aluno6 = new Aluno("Joana", 20, 9.5);
		
		fila.add(aluno1);
		fila.add(aluno2);
		fila.add(aluno6);
		fila.remove();
		
		System.out.println(""+fila.toString());
		
	}
}
