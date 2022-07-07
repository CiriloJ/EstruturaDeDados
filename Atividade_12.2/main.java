public class main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Antonio", 35, 10);
		Aluno aluno2 = new Aluno("Joao", 20, 9.5);
		Aluno aluno3 = new Aluno("ze", 28, 10);
		Aluno aluno4 = new Aluno("maria", 20, 9.5);
		Aluno aluno5 = new Aluno("ana", 30, 10);
		Aluno aluno6 = new Aluno("Joana", 20, 9.5);
		
		FilaLista fila = new FilaLista();
		
		fila.add(aluno1);
		fila.add(aluno2);
		fila.add(aluno3);
		fila.add(aluno4);
		fila.add(aluno5);
		fila.add(aluno6);

		fila.imprime();
		
		if (fila.size()>0){
			Object o[]=fila.getFila();
			int x=fila.size();
			PilhaLista p = new PilhaLista();
			for (int i=0;i<x;i++) {
				p.push(o[i]);
				fila.remove();
			}
			for (int i=0;i<x;i++) {
				fila.add(p.pop());
			}
		}
		
		fila.imprime();

	}
}