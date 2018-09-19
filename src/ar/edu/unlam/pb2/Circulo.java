package ar.edu.unlam.pb2;

public class Circulo {
	private Double radio;
	
	
	public Circulo(Double radio) {
		this.radio=radio;
		
	}
	public Circulo() {
		this.radio=1.0;
		
	}
	public Double calcularPerimetro() {
		
		return (2*radio*Math.PI) ;
	}
	public Double calcularArea() {
		return (Math.PI*radio*radio) ;
	}
}
