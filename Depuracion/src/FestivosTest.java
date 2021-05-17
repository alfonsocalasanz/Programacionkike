import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.source.tree.AssertTree;

class FestivosTest extends Festivos{
	private Festivos festivos;
	
	public static void FestivosTest() {
		Festivos = new Festivos();
	}
	@Test
	void testFestivos() {
		assertTrue(festivos.Festivos);
	}

	@Test
	void testIncluirDiaFestivo() {
		assertTrue((festivos.incluirDiaFestivo(22, fiesta));
	}

	@Test
	void testConsultarFestividad() {
		assertFalse((festivos.consultarMotivoFestividad(23)));
	}

	
	@Test
	void testConsultarMotivoFestividad() {
		assertEqueals(festivos.consultarMotivoFestividad(23));
	}

	@Test
	void testContarDiasFestivos() {
		assertNull(festivos.contarDiasFestivos());
	}

	@Test
	void testConsultarMesConMasFestivos() {
		assertSame(festivos.consultarMesConMasFestivos());
	}

	@Test
	void testConsultarPrimerFestivo() {
		assertTrue(festivos.consultarPrimerFestivo());
	}

}
