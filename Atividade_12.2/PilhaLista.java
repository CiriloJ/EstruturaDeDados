public class PilhaLista implements IPilha {
	private Noh topo;
	private int numElem=0;
	
	public PilhaLista (){ //construtor
		this.topo = null;
	}

	public boolean push(Object info){ //empilha
		Noh novo = new Noh(info);
		if (this.isEmpty()) {
			topo = novo;
			this.numElem++;
		}else {
			novo.setProx(topo);
			topo = novo;
			this.numElem++;
		}
		return true;
	}

	public Object pop(){ //desempilha
		Object info = null;
		if (!this.isEmpty()){
			info = topo.getInfo();
			topo = topo.getProx();
			this.numElem--;
		}
		return info;
	}

	@Override
	public Object top() {
		if(this.isEmpty()){
			System.out.println("Pilha vazia");
			return null;
		}
		return topo;
	}

	@Override
	public boolean isEmpty() {
		if (this.topo==null){
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		if (isEmpty()){
			return 0;
		}
		return numElem;
	}
	
	public void imprime() {

        Noh p = this.topo;
        while (p != null) {
            System.out.println(p.getInfo().toString()); 
            p = p.getProx();
        }
        System.out.println("");
    }
}
