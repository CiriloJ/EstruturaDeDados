public interface IPilha {
	public boolean push(char info);
	public char pop();
	public char top(); //retorna sem removê-lo
	public boolean isEmpty();
	public int size();
}