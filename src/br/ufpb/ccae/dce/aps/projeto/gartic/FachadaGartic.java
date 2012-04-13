package br.ufpb.ccae.dce.aps.projeto.gartic;

import java.util.LinkedList;
import java.util.List;

public class FachadaGartic {

	private Gartic gartic;

	public Gartic getGartic() {
		return gartic;
	}

	public void setGartic(Gartic gartic) {
		this.gartic = gartic;
	}

	private  GerenciadorConexaoRede conectar;
	private  GerenciadorBancoPalavras bd;
	private  Editor paint;
	String tema;
	private Jogador jogador;

	public FachadaGartic(){
		this.gartic = new Gartic();
		this.bd = new GerenciadorBancoPalavras();
		this.conectar = new GerenciadorConexaoRede();
		this.jogador = new Jogador();
	}
	
	public boolean conexao(){
		this.conectar.servidor();
		this.conectar.pesquisarIp();
		return true;
	}

	public  boolean iniciarJogo(Gartic gartic){ 
		gartic.iniciar();
		conectar.start();	
		return true;
	}

	public void secaoTema(String escolherTema){
		bd.tema(escolherTema);
	}

	public boolean initPartida(){
		paint.editor();
		conectar.pesquisarIp();
		conectar.servidor();
		bd.tema(tema);
		bd.palavraAdvinhar();
		return true;
	}

	public  boolean insereNick(String nomenick){
		jogador.setNomenick(nomenick);
		//j.setNomenick(nomenick);
		return true;
	}

	public boolean existeNick(String nick) {
		for(String nicks : gartic.getNicks()){
			if(nicks.equals(nick)){
				return true;
			}
		}
		return false;
	}

	public boolean existeSala(String tema, Jogador jogador) {
		if((tema != " ") || (jogador != null)){
			return true;
		}
		return false;
	}

	public Sala insereSala(String tema, Jogador jogador) {
		Sala partida = new Sala();
		return partida;
	}
	
	/*public List<GerenciadorConexaoRede> Rede(LinkedList<ConexaoRede> listaIP){
  		listaIP = new LinkedList<GerenciadorConexaoRede>();
  		return  listaIP;
	}*/

}