package com.training.Tenis.Torneio;

import static org.junit.Assert.*;

import org.junit.Test;

public class TorneioTest {

	TorneioTenis torneioTenis;
	public TorneioTest() {
		torneioTenis = new TorneioTenis();
	}
	@Test
	public void testVitoria() {
		char[] Partidas = {'V','V','P','P','P','V'};
		assertEquals(2, torneioTenis.Torneio(Partidas),0);
	}
	@Test
	public void testDerrota() {
		char[] Partidas = {'P','P','P','P','P','P'};

		assertEquals(-1, torneioTenis.Torneio(Partidas),0);
	}
	
}
