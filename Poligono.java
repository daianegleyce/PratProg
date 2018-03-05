
public abstract class Poligono extends Figura {
	
	double base;
	double altura;
	
	
	public abstract double diagonal();
	
	public Poligono(double b, double a) {
		this.altura = a;
		this.base = b;
	}
}