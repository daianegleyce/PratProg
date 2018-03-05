
public class Losango extends Poligono{

	public Losango(double b, double a) {
		super(b, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimetro() {
		return base*4;
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		return base*altura;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}