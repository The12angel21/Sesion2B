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
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaEncargado() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculoNominaBrutaEncargadoVentasNegativas() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasEntre0y1000() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasEntre1000y1500() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasMayor1500() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtraNegativas() {
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtraPositivas() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculoNominaNeta() {
		fail("Not yet implemented");
	}

}
