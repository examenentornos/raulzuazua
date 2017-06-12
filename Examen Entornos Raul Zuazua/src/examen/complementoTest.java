package examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class complementoTest {

	@Test
	public void testCOMPLE3() {
		assertEquals("Complemento 300€", examen.complemento.comple("100;Diego Alvarez;1;SI"));
	}
	
	
	@Test 
	public void testCOMPLE2() {
		assertEquals("Complemento 500€", examen.complemento.comple("101;Alba Gomez;7;NO"));
	}
	
	
	
	@Test (expected=Exception.class)
	public void test000() {
		examen.complemento.comple("000;Jesus Garcia;10;SI");
	}
	
	
	@Test (expected=Exception.class)
	public void test1001() {
		examen.complemento.comple("1001;Carmen Ruiz;9;NO");
	}
	
	
	
	@Test (expected=Exception.class)
	public void testABC() {
		examen.complemento.comple("abc;Sandra Lopez;2;SI");
	}
	
	
	
	@Test (expected=Exception.class)
	public void testNOMBRELARGO() {
		examen.complemento.comple("123;Juan Gonzalez Fernandez;3;SI");
	}
	
	
	
	@Test (expected=Exception.class)
	public void testAntiguedad_Negativa() {
		examen.complemento.comple("123;Carmen Ruiz;-1;SI");
	}
	
	
	
	@Test (expected=Exception.class)
	public void testAntiguedad_Mayor_de_100() {
		examen.complemento.comple("123;Carmen Ruiz;111;NO");
	}
	
	
	
	@Test (expected=Exception.class)
	public void testAntiguedad_LETRAS() {
		examen.complemento.comple("123;Carmen Ruiz;ab;NO");
	}
	
	
	
	@Test (expected=Exception.class)
	public void test_Plus_Simbolo() {
		examen.complemento.comple("123;Carmen Ruiz;8;*");
	}
	
	
	

}
