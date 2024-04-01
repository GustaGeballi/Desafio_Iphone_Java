package aparelhoTelefonico;

//import java.util.Random;
//import java.util.Scanner;

public class Telefone implements AparelhoTelefonico{

/*	TODO -- Implementar seleções para deixar mais dinâmico
 * 
 * public void ligar() {
		
		Scanner sc1 = new Scanner(System.in);
		Random random = new Random();
		
		int cod = 0, rep, resp;
		
		for(rep = 1; rep<=3; rep++) {
			System.out.println("Ligando...\n");
			cod = random.nextInt(3);
			
			if(cod == 1) {
				atender();
				break;
			}else {
				System.out.println("Telefone não atendido\n");
				if(rep<=2) {
				System.out.println("Pressione 1 para tentar novamente");
				resp = sc1.nextInt();
				}else {
					resp=2;
				}
				switch(resp) {
				case 1:
					if(rep<3)
						System.out.println("Tentando novamente\n");
					else
						break;
					break;
				case 2:
					System.out.println("Desligado\n");
					break;
				}
			}
		}
	} */

	public void ligar() {
		System.out.println("Ligando...\n");
		
	}
	
	public void atender() {
		System.out.println("Telefone Atendido\n");
		
	}

	
	public void iniciarCorreioVoz() {
		System.out.println("Correio de Voz Iniciado\n");
	}

}
