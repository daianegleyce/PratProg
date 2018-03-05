
public class Esfera extends Figura {

	double raio;
	
	public Esfera(double r) {
		this.raio = r;
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
	public double volume() {
		return (4/3)*Math.PI*this.raio;
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return 0;
	}

}