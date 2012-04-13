package br.ufpb.ccae.dce.aps.projeto.gartic;

import java.util.LinkedList;
import java.util.List;

public class Gartic {
	
	private List<String> nicks;
	private List<String> temas;
	
	public Gartic(){
		nicks = new LinkedList<String>();
		temas = new LinkedList<String>();
	}

	public void iniciar() {
		// TODO Auto-generated method stub
		
	}

	public List<String> getNicks() {
		return nicks;
	}
	
	public void setNicks(List<String> nicks){
		this.nicks = nicks;
	}

	


}
