
public class Quadrado extends Poligono{
	
	
	public Quadrado(double l, double a) {
		super(l, a);

	}
	
	@Override
	public double diagonal() {
		return this.altura * Math.sqrt(2);
	}

	@Override
	public double area() {
		return this.base * this.altura;
	}

	@Override
	public double perimetro() {
		return this.base*4;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
