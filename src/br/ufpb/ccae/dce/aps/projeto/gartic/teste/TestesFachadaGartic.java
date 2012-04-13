package br.ufpb.ccae.dce.aps.projeto.gartic.teste;

import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.Test;
import br.ufpb.ccae.dce.aps.projeto.gartic.FachadaGartic;
import br.ufpb.ccae.dce.aps.projeto.gartic.Gartic;;

public class TestesFachadaGartic {

	@Test
	public void testExistNick() {
		FachadaGartic fachada = new FachadaGartic();
		Assert.assertFalse(fachada.existeNick(" jds "));
	}
	
	@Test
	public void testNick() {
		FachadaGartic fachada = new FachadaGartic();
		//fachada.initPartida();
		Assert.assertFalse(fachada.existeNick(" jds "));
		Assert.assertTrue(fachada.insereNick(" jds "));
	}
	
	@Test
	public void testExistSala() {
		FachadaGartic fachada = new FachadaGartic();
	    Assert.assertFalse(fachada.existeSala(" jds "));
	}
	
	@Test
	public void testSala() {
		FachadaGartic fachada = new FachadaGartic();
		//fachada.initPartida();
		Assert.assertFalse(fachada.existeNick(" jds "));
		Assert.assertTrue(fachada.insereNick(" jds "));
	}
	
	@Test
	public void testInitPartida() {
		FachadaGartic fachada = new FachadaGartic();
		fachada.initPartida();
		Assert.assertTrue(fachada.insereNick(" jds "));
	}
	
	@Test
	public void testInitConexaoBD() {
		FachadaGartic fachada = new FachadaGartic();
		//fachada.initPartida();
		Assert.assertFalse(fachada.existeNick(" jds "));
		Assert.assertTrue(fachada.insereNick(" jds "));
	}
	
	@Test
	public void testInitEditor() {
		FachadaGartic fachada = new FachadaGartic();
		//fachada.initPartida();
		Assert.assertFalse(fachada.existeNick(" jds "));
		Assert.assertTrue(fachada.insereNick(" jds "));
	}
	
}