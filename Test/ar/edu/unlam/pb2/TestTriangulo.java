package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangulo {

	@Test
	public void testQueCalculaAreDelTriangulo() {
		Triangulo miTriangulo = new Triangulo(4.0, 2.0, 1.0, 1.0, 1.0);
		Double valorEsperado = 4.0;
		Double actual = miTriangulo.calcularAreaDelTriangulo();
		assertEquals(valorEsperado, actual,0.01);
	}
	
	@Test
	public void testQueCalculaPerimetroDelTriangulo() {
		Triangulo miTriangulo = new Triangulo (4.0,2.0,1.0,1.0,1.0);
		Double valorEsperado = 3.0;
		Double actual = miTriangulo.calcularPerimetroDelTriangulo();
		assertEquals(valorEsperado, actual,0.01);
	}

}
