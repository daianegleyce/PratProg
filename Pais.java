package pais;

public class Pais {                     //id (int), nome (String), populacao (long) e area (double).
	private int id;
	private String nome;
	private long populacao;
	private double area;
	
	
	public Pais() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getPopulucao() {
		return populacao;
	}
	
	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}

	public void MenorArea() {
		
		if(area <0) {
			System.out.println("Pais com Menor Area" + area );
		}else {
			System.out.println("Paises com Maior Area");
		}
	}
	
}
