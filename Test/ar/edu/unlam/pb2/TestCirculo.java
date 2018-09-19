package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCirculo {

	@Test
	public void testCalcularArea() {
		Circulo uncirculo = new Circulo(2.0);
		Double valorEsperado=12.5;
		Double valorObtenido = uncirculo.calcularArea();
		assertEquals(valorEsperado, valorObtenido,0.1);
	}
	
	@Test
	public void testCalcularPerimetro() {
		Circulo uncirculo = new Circulo(45.0);
		Double valorEsperado=282.70;
		Double valorObtenido = uncirculo.calcularPerimetro();
		assertEquals(valorEsperado, valorObtenido,0.1);
		
	}
}
