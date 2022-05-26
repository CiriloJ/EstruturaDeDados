package aula5;

public class Vetor implements IVetor{
	private Object[] elementos = new Object[5];
	private int totalElementos = 0;
	
	public void adiciona(Object o) {
		this.garanteEspaco();
		if(!this.cheio()) {
			this.elementos[this.totalElementos] = o;
			this.totalElementos++;
		}else {
			System.out.print("Cheio");
		}
		
	}
	
	public int tamanho() {
		return this.totalElementos;
	}
	
	public boolean contem(Object o) {
		for (int i=0; i<this.totalElementos; i++) {
			if (o != this.elementos[i]) {
				return true;
			}
		}
		return false;
	}
	
	public boolean cheio(){
		if (totalElementos == this.elementos.length) {
			return true;
		}
		return false;
	}
	
	private void garanteEspaco(){
		if (this.cheio()){
			Object[] novoElementos = new Object[this.elementos.length * 2];
			for (int i=0; i < this.elementos.length; i++)
				novoElementos[i] = this.elementos[i];
			this.elementos = novoElementos;
		}
	}
	
	public boolean remove(Object o){
		int indice = -1;
		Object[] vetorInt = new Object[1000];
		
		for(int i=0; i < totalElementos; i++)  //faz a busca
			if (o==this.elementos[i])
				{indice = i; break; }
		if (indice != -1){ //achou o elemento
			for(int i=indice; i<(totalElementos-1); i++)
				vetorInt[i] = vetorInt[i+1];
			totalElementos--;
			return true;
		}
		return false;
	}
	
	public void imprime() {
		for (int i=0; i<this.totalElementos; i++) {
			System.out.print(""+ this.elementos[i].toString()+"\n");
		}
	}

}