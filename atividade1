import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		PontoCartesiano p = new PontoCartesiano(0, 0, 0, 0);
		int x;
		double distancia;
		
		System.out.println("Digite o a coordenada XA");
		x=e.nextInt();
		p.setXa(x);
		System.out.println("Digite o a coordenada YA");
		x=e.nextInt();
		p.setYa(x);
		System.out.println("Digite o a coordenada XB");
		x=e.nextInt();
		p.setXb(x);
		System.out.println("Digite o a coordenada YB");
		x=e.nextInt();
		p.setYb(x);
		
		distancia = calcula(p);
		
		System.out.println("Distancia entre A e B: "+distancia);
    }
	
	public static double calcula(PontoCartesiano p) {
		double d = 0;
		
		d=Math.sqrt((Math.pow((p.xb-p.xa),2)+Math.pow((p.yb-p.ya),2)));
		
		return d;
		
	}
	
}
