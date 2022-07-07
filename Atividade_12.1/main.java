import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner e = new Scanner (System.in);
		String palavra;
		
		System.out.println("Digite uma palavra:");
		palavra = e.next();
		if (palindromo(palavra)){
			System.out.println("É palíndromo");
		}else {
			System.out.println("Não é palíndromo");
		}
	}
	
	public static boolean palindromo(String palavra){
		int x=palavra.length();
		PilhaVet p = new PilhaVet(x);
		for (int i=0;i<x;i++) {
			char c = palavra.charAt(i);
			p.push(c);
		}
		for (int i=0;i<x;i++) {
			if (!(p.pop()==palavra.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}