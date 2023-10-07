package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void testCalculoNominaBrutaVendedor() {
		int expected =2000;
		int actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 0, 0);
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testCalculoNominaBrutaEncargado() {
		int expected = 2500;
		int actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 0, 0);
		assertEquals(expected, actual);
		
	}

	@Test
	void testCalculoNominaBrutaEncargadoVentasNegativas() {
		int expected =2500;
		int actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, -10, 0);
		assertEquals(expected, actual);
		;
	}
	
	@Test
	void testCalculoNominaBrutaVentasEntre0y1000() {
		int expected =2000;
		int actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 500, 0);
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testCalculoNominaBrutaVentasEntre1000y1500() {
		int expected =2100;
		int actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1200, 0);
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testCalculoNominaBrutaVentasMayor1500() {
		int expected =2200;
		int actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1600, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtraNegativas() {
		int expected =2000;
		int actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 0, -20);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtraPositivas() {
		int expected =2060;
		int actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 0, 2);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaNetaEntre2100y2500() {
		int expected =1700;
		int actual = Empleado.calculoNominaNeta(TipoEmpleado.Vendedor, 0, 0);
		assertEquals(expected, actual);
	}
	
	void testCalculoNominaNetaMas2500() {
		int expected =1760;
		int actual = Empleado.calculoNominaNeta(Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 0, 0));
		assertEquals(expected, actual);
	}

}
