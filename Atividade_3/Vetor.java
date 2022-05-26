package aula4;

public class Vetor implements IVetor{
	private Aluno[] alunos = new Aluno[5];
	private int totalAlunos = 0;
	
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		if(!this.cheio()) {
			this.alunos[this.totalAlunos] = aluno;
			this.totalAlunos++;
		}else {
			System.out.print("Cheio");
		}
		
	}
	
	public int tamanho() {
		return this.totalAlunos;
	}
	
	public boolean contem(Aluno aluno) {
		for (int i=0; i<this.totalAlunos; i++) {
			if (aluno != this.alunos[i]) {
				return true;
			}
		}
		return false;
	}
	
	public boolean cheio(){
		if (totalAlunos == this.alunos.length) {
			return true;
		}
		return false;
	}
	
	private void garanteEspaco(){
		if (this.cheio()){
			Aluno[] novoAlunos = new Aluno[this.alunos.length * 2];
			for (int i=0; i < this.alunos.length; i++)
				novoAlunos[i] = this.alunos[i];
			this.alunos = novoAlunos;
		}
	}
	
	public boolean remove(String nome){
		int indice = -1;
		Aluno[] vetorInt = new Aluno[1000];
		
		for(int i=0; i < totalAlunos; i++)  //faz a busca
			if (nome.equals(this.alunos[i].getNome()))
				{indice = i; break; }
		if (indice != -1){ //achou o elemento
			for(int i=indice; i<(totalAlunos-1); i++)
				vetorInt[i] = vetorInt[i+1];
			totalAlunos--;
			return true;
		}
		return false;
	}

}
