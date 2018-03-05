
public class Retangulo extends Poligono {
	
	
	public Retangulo(double l, double a) {
		super(l, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimetro() {
		return this.base*2 +this.altura*2;
	}

	@Override
	public double diagonal() {
		return Math.sqrt((Math.exp(this.altura)+Math.exp(this.base)));
	}

	@Override
	public double area() {
		return (this.base*2) + (this.altura*2);
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
