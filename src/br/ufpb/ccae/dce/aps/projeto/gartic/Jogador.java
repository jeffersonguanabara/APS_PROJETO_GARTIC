package br.ufpb.ccae.dce.aps.projeto.gartic;

public class Jogador {
	
	private String nomenick;
	private int pontuacao;
	private boolean status;
	

	public String getNomenick(){
		return nomenick;
	}
	public void setNomenick(String nomenick) {
		this.nomenick = nomenick;
		
	}
	
	public int getPontuacao(){
		return pontuacao;
	}
	public void setPontuação(int pontuacao){
		this.pontuacao = pontuacao;
	}
	
	public boolean getStatus(){
		return status;
	}
	
	public void setStatus(String status){
		if(status.equals("conectado")){
			this.status = true;
		}
		this.status = false;
	}
	

}
