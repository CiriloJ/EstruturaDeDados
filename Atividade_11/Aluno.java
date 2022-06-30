public class Aluno {
	
	String nome;
	int idade;
	double nota;
	
	public Aluno(String nome, int idade, double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + this.nome + ", idade=" + this.idade + ", nota=" + this.nota + "]";
	}
}