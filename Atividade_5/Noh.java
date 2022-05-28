package aula6;

public class Noh {
	private Object info; //este exemplo armazena números inteiros
	private Noh prox;
	
	public Noh (Object info){
		this.info = info;
		this.prox = null;
	}
	
	public Object getInfo() { return this.info; }
	public Noh getProx() { return this.prox; }
	public void setProx(Noh n) { this.prox = n; }
}