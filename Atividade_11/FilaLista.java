public class FilaLista implements IFila {//TAD Lista simplesmente encadeada
	private Noh inicio;
	private Noh fim;
	
	public FilaLista(){
		this.inicio = null;
		this.fim = null;
	}
	
	public boolean add(Object info) { //info = 5
		Noh novo = new Noh(info);
		
		if (this.isEmpty()) {
			inicio = novo;
			fim = novo;
		}			
		else {
			fim.setProx(novo);
			fim = novo;
		}
		return true;
	}	
	
	public boolean isEmpty() {
		if (inicio==null) {
			return true;
		}
		return false;
	}
	
	public int size() {
        Noh p = inicio;
        int cont = 0;

        while (p != null) { //busca
            p = p.getProx();
            cont++;
        }
        return cont;
	}
	
	public void imprime() {

        Noh p = this.inicio;
        while (p != null) {
            System.out.println(p.getInfo().toString()); 
            p = p.getProx();
        }
        System.out.println("");
    }

	public boolean remove() {
		if (!isEmpty()){
			if (inicio == fim) {
				inicio = null;
				fim = null;
			} else {
				inicio = inicio.getProx();
				return true;
			}
		}
		return false;
	}
	
}