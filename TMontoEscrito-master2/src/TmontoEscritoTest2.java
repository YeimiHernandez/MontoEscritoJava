import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TmontoEscritoTest2 {

	@Test
	void testGeneraMonto() {
		TmontoEscrito tm = new TmontoEscrito();	
		String resultEsperado=" ocho mil Cuatrocientos cincuenta tres";
		String resultobtenido= tm.generaMonto(8452);
		assertEquals(resultEsperado,resultobtenido);
	}
	
}
