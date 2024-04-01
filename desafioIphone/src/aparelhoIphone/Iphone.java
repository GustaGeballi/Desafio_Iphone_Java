package aparelhoIphone;

import aparelhoTelefonico.Telefone;
import reprodutorMusica.Reprodutor;
import navegadorInternet.Navegador;

import java.util.Scanner;

public class Iphone {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		Telefone telefone = new Telefone();
		Reprodutor reprodutor = new Reprodutor();
		Navegador navegador = new Navegador();
		
		
		telefone.ligar();
		telefone.atender();
		telefone.iniciarCorreioVoz();
		
		reprodutor.tocar();
		reprodutor.pausar();
		reprodutor.selecionarMusica();
		
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		navegador.exibirPagina();
		
	}

}
