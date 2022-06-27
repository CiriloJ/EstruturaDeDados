import java.util.Arrays;

public class FilaVet implements IFila{
	private int nElemFila;
	private int inicio;
	private int fim;
	private Object[] vetFila;
	
	public FilaVet (int tamFila){ //construtor
		this.nElemFila = 0;
		this.inicio = 0;
		this.fim =0;
		this.vetFila = new Object[tamFila];
	}
	
	public boolean add(Object info){ //método que insere na fila
		if (this.nElemFila == vetFila.length) {
			System.out.println("Capacidade da fila esgotou");
			return false;
		}
		this.fim = (this.inicio + this.nElemFila) % this.vetFila.length;
		this.vetFila[fim] = info;
		this.nElemFila++;
		return true;
	}
	
	
	
	public boolean remove() { //método que retira da fila
		if (this.isEmpty()){ //como verificar se está vazia?
			System.out.println("Fila estah vazia");
			return false;
		}
		this.vetFila[inicio] = null;
		this.inicio = (this.inicio + 1) % this.vetFila.length;
		this.nElemFila--;
		return true;
	}

	@Override
	public boolean isEmpty() {
		if (nElemFila==0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return nElemFila;
	}

	@Override
	public String toString() {
		return "Tamanho=" + nElemFila + "\ninicio=" + inicio + "\nfim="+fim+"\nvetFila=" + Arrays.toString(vetFila) + "]";
	}
	
}