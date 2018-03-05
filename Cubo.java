
public class Cubo extends Poligono {
	
	double largura;
	
	public Cubo(double b, double a, double c) {
		super(b, a);
		this.largura = c;
	}
	
	@Override
	public double area() {
		return this.base * this.altura;
	}

	@Override
	public double perimetro() {
		return (this.altura) + (this.base) *2;
	}

	@Override
	public double volume() {
		return this.altura*this.altura*this.largura;
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

}