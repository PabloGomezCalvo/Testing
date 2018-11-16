package Agenda;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDiaBreak {

	
	@Test(expected = DatoException.class)
	public void PedirCitaDiaNegativo() throws DatoException {
		DiaBreak d = new DiaBreak (-1);
		
	}
	
	@Test(expected = DatoException.class)
	public void PedirCitaDia0() throws DatoException {
		DiaBreak d = new DiaBreak (0);
		
	}
	@Test
	public void PedirCitaDia365() throws DatoException {
		DiaBreak d = new DiaBreak (365);
		
	}
	@Test(expected = DatoException.class)
	public void PedirCitaDia370() throws DatoException {
		DiaBreak d = new DiaBreak (370);
		
	}
	
	
	@Test
	public void BuscaSlotSinCitasPrevias()  throws DatoException {
		DiaBreak d = new DiaBreak(1);
		assertTrue(d.buscaSlot(1)==9);
		assertTrue(d.buscaSlot(2)==9);
		assertTrue(d.buscaSlot(5)==9);
		assertTrue(d.buscaSlot(8)==9);
		assertTrue(d.buscaSlot(10)==-1);
	}
	@Test
	public void AsignarPrimeraCita()  throws DatoException {
		DiaBreak d = new DiaBreak(1);
		Cita c = new Cita("Operacion",1);
		assertTrue(d.asignarCita(17, c));
	}
	@Test
	public void AsignarDosCitas()  throws DatoException {
		DiaBreak d = new DiaBreak(1);
		Cita c = new Cita("Operacion",3);
		Cita c1 = new Cita("Operacion",3);
		assertTrue(d.asignarCita(9, c));
		assertTrue(d.asignarCita(14, c1));
		
	}
	
	@Test
	public void HuecoLibreUltimaHora()  throws DatoException {
		DiaBreak d = new DiaBreak(1);
		assertTrue(d.huecoLibre(17, 1));
	}
	
	@Test
	public void HuecoLibre()  throws DatoException {
		DiaBreak d = new DiaBreak(1);
		assertTrue(d.huecoLibre(15, 4));
	}
	
	
	

}
