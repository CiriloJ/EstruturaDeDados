import java.util.Arrays;

public class PilhaVet implements IPilha {
	private char[] pilha;
	private int numElem;

	
	public PilhaVet (int tamanhoVetor){ //construtor
		this.pilha = new char[tamanhoVetor];
		this.numElem = 0;
	}

	public boolean push(char info){ //empilha
		if (this.numElem == pilha.length){
			System.out.println("pilha estourou");
			return false;
		}
		this.pilha[this.numElem] = info;
		this.numElem++;
		return true;
	}

	public char pop(){ //desempilha
		char o = '1';
		if(this.isEmpty()){
			System.out.println("Pilha vazia");
			return '1';
		}
		o = this.pilha[numElem - 1];
		this.pilha[numElem - 1] = '1';
		this.numElem--;
		return o;
	}

	public char top() {
		char o = '1';
		if(this.isEmpty()){
			System.out.println("Pilha vazia");
			return '1';
		}
		o = this.pilha[numElem];
		return o;
	}

	public boolean isEmpty() {
		if (this.pilha[0]=='1'){
			return true;
		}
		return false;
	}

	public int size() {
		if (isEmpty()){
			return 0;
		}
		return numElem+1;
	}

	@Override
	public String toString() {
		return "PilhaVet [pilha=" + Arrays.toString(pilha) + "]";
	}
	
}
