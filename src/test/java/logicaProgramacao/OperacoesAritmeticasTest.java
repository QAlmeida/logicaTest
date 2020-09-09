package logicaProgramacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OperacoesAritmeticasTest {
	OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();
	
	@Test
	public void validaAreaRetangulo() {
		int area;
		area = opAritmeticas.getAreaRetangulo(10, 10);
		assertEquals(100, area);
	}
	
	@Test
	public void validaMediaAritmetica() {
		
		double media = opAritmeticas.getMediaAritmetica(5.5, 6.2, 8.8, 4.4);
		
		assertEquals(6.225, media, 0);
		
	}
	
	@Test
	public void validaConverteReais() {
		double converte = opAritmeticas.getConverteReais(5.36, 2);
		assertEquals(10.72, converte, 0);
	}
	
	@Test
	public void validaExponencial() {
		double exp = opAritmeticas.getExponencial(2, 2);
		assertEquals(4, exp, 0);
	}
	

}
