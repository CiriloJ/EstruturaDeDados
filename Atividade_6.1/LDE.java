package aula7;

public class LDE implements Lista {//TAD Lista simplesmente encadeada
	private Noh inicio;
	private Noh fim;
	
	public LDE (){
		this.inicio = null;
		this.fim = null;
	}
	
	public void insereInicio(int info) { 
		Noh novo = new Noh(info);
		
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		}
		else {
			novo.setProx(inicio);
			inicio.setAnt(novo);
			inicio = novo;
		}
	}
	
	public void insereFim(int info) { //info = 7
		Noh novo = new Noh(info);
		if (fim == null) {
			inicio = novo;
			fim = novo;
		}else {
			novo.setAnt(fim);
			fim.setProx(novo);
			fim = novo;	
		}
	}
	
	
	public boolean estahVazia() {
		if (inicio==null) {
			return true;
		}
		return false;
	}
	
	public Noh busca(int info) {
		Noh p = inicio;
		while (p!=null && p.getInfo() != info){ //busca
			p = p.getProx();
		}
		return p;
	}
	
	public boolean remove(Noh p) {
		if (p==null) {// não achou, então não faz nada e retorna false
			return false;
		}
		if (p.getAnt() == null){
			inicio = p.getProx();
			inicio.setAnt(null);
		} else if (p.getProx() == null){
			p.getAnt().setProx(null);
			fim = p.getAnt();
		}else {
			p.getAnt().setProx(p.getProx());
			p.getProx().setAnt(p.getAnt());
		}
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
	
	
	public void imprimeIniParaFim() {

        Noh p = this.inicio;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getProx();
        }
        System.out.println("");
    }
	
	public void imprimeFimParaIni() {

		Noh p = this.fim;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getAnt();
        }
        System.out.println("");
    }
}