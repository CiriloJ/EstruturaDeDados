package aula6;

public class LSE implements Lista {//TAD Lista simplesmente encadeada
	private Noh inicio;
	
	public LSE (){
		this.inicio = null;
	}
	
	public void insereInicio(Object info) { //info = 5
		Noh novo = new Noh(info);
		
		if (inicio == null)
			inicio = novo;
		else {
			novo.setProx(inicio);
			inicio = novo;
		}
	}
	
	public void insereFim(Object info) { //info = 7
		Noh novo = new Noh(info);
		if (inicio == null) {
			inicio = novo;
		}else {
			Noh ultimo = null;
			for(Noh i=inicio; i != null; i=i.getProx()) {
				ultimo = i;
			}
			ultimo.setProx(novo);		
		}
	}
	
	
	public boolean estahVazia() {
		Noh p;
		p = inicio;
		if (p==null) {
			return true;
		}
		return false;
	}
	
	
	
	public boolean remove(Object info) {
		Noh ant = null, p;
		p = inicio;
		while (p!=null && p.getInfo() != info){ //busca
			ant = p;
			p = p.getProx();
		}
		if (p==null) // não achou, então não faz nada e retorna false
			return false;
		if (ant==null) //retira info do início
			inicio = p.getProx();
		else
			ant.setProx(p.getProx());
		return true;
	}
	
	
	public int tamanho() {
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
            System.out.println(p.getInfo());
            p = p.getProx();
        }
        System.out.println("");
    }
}