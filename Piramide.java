
public class Piramide extends Poligono {
	
	double largura;
	
	public Piramide(double b, double a, double c) {
		super(b, a);
		
		this.largura = c;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volume() {
		return (1/3)*this.base*this.altura*this.largura;
	}

}
