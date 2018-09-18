package ar.edu.unlam.pb2;

public class Triangulo {

	private Double base;
	private Double altura;
	private Double lado1;
	private Double lado2;
	private Double lado3;
	
	public Triangulo (Double base, Double altura,Double lado1,Double lado2,Double lado3) {
		this.base=base;
		this.altura=altura;
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	
	public Double calcularAreaDelTriangulo () {
		return (base*altura)*0.5;
	}
	
	public Double calcularPerimetroDelTriangulo () {
		return lado1+lado2+lado3;
	}
	
	
	
}
