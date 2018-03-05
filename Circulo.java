
public class Circulo extends Figura {
	
	double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return this.raio*Math.PI;
	}

	@Override
	public double perimetro() {
		return 2*Math.PI*this.raio;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
