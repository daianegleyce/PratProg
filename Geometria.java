import java.util.ArrayList;

public class Geometria {
	public static void main (String args[]) {
		
		ArrayList<Figura> figuras = new ArrayList<>();
		
		figuras.add(new Losango(3,4));
		figuras.add(new Quadrado(3,4));
		figuras.add(new Triangulo(3,4,7));
		figuras.add(new Retangulo(3,4));
		
		for(Figura fig:figuras) {
			System.out.println(fig.area());
			System.out.println(fig.perimetro());
			System.out.println(fig.diagonal());
			System.out.println(fig.volume());			
		}
		
	}
}
