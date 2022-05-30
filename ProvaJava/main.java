import java.util.*;

public class main {
	
	public static void mostrarCaixas(String caixa1, String caixa2, String caixa3, String caixa4, String caixa5) {
		System.out.println(" ");
		System.out.println("  "+caixa1+"     "+caixa2+"     "+caixa3+"     "+caixa4+"     "+caixa5+"  ");
		System.out.println(" ___   ___   ___   ___   ___ ");
		System.out.println("|   | |   | |   | |   | |   |");
		System.out.println("|___| |___| |___| |___| |___|");
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 50; ++i) System.out.println(); //Gambiarra mestre pra limpar a tela. Hahahahaha
		System.out.println("SEJA BEM VINDO!");
		System.out.println("Vamos jogar Super Mario Bros!");
		System.out.println("---");
		
		Random numero = new Random();
		
		Scanner entrada = new Scanner(System.in);
		
		Mario jogador = new Mario();
		
		int x1 = numero.nextInt(4)+1;
		int x2 = numero.nextInt(4)+1;
		int x3 = numero.nextInt(4)+1;
		int x4 = numero.nextInt(4)+1;
		int x5 = numero.nextInt(4)+1;
		String caixa1 = "1";
		String caixa2 = "2";
		String caixa3 = "3";
		String caixa4 = "4";
		String caixa5 = "5";
		
		int caixa = 0;
		
		//1 = Cogumelo
		//2 = Pena
		//3 = Fogo
		//4 = Dano
		
		System.out.println(x1 + " " + x2 + " " + x3 + " " + x4 + " " + x5);
		System.out.println("Escolha uma das caixas abaixo:");
		mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
		System.out.print("Digite o número: ");

		try {
		while(caixa < 5) {
			
			int valor = entrada.nextInt();
			
			for (int i = 0; i < 50; ++i) System.out.println(); //Gambiarra mestre pra limpar a tela. Hahahahaha
			if (valor == 1) {
				System.out.println("Você abriu a caixa 1:" );
				caixa1 = "X";
				if(x1 == 1) {
					jogador.pegarCogumelo();
					x1 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x1 == 2) {
					jogador.pegarPena();
					x1 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x1 == 3) {
					jogador.pegarFogo();
					x1 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x1 == 4){
					jogador.pegarDano();
					x1 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x1 == 0) {
					System.out.println("Essa caixa já foi aberta!");
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				System.out.println("Total de pontos: " +jogador.mostrarPontos());
			}
			else if (valor == 2) {
				System.out.println("Você abriu a caixa 2:" );
				caixa2 = "X";
				if(x2 == 1) {
					jogador.pegarCogumelo();
					x2 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x2 == 2) {
					jogador.pegarPena();
					x2 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x2 == 3) {
					jogador.pegarFogo();
					x2 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x2 == 4){
					jogador.pegarDano();
					x2 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x2 == 0) {
					System.out.println("Essa caixa já foi aberta!");
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				System.out.println("Total de pontos: " +jogador.mostrarPontos());
			}
			else if (valor == 3) {
				System.out.println("Você abriu a caixa 3:" );
				caixa3 = "X";
				if(x3 == 1) {
					jogador.pegarCogumelo();
					x3 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x3 == 2) {
					jogador.pegarPena();
					x3 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x3 == 3) {
					jogador.pegarFogo();
					x3 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x3 == 4){
					jogador.pegarDano();
					x3 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x3 == 0) {
					System.out.println("Essa caixa já foi aberta!");
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				System.out.println("Total de pontos: " +jogador.mostrarPontos());
			}
			else if (valor == 4) {
				System.out.println("Você abriu a caixa 4:" );
				caixa4 = "X";
				if(x4 == 1) {
					jogador.pegarCogumelo();
					x4 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x4 == 2) {
					jogador.pegarPena();
					x4 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x4 == 3) {
					jogador.pegarFogo();
					x4 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x4 == 4){
					jogador.pegarDano();
					x4 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x4 == 0) {
					System.out.println("Essa caixa já foi aberta!" );
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				System.out.println("Total de pontos: " +jogador.mostrarPontos());
			}
			else if (valor == 5) {
				System.out.println("Você abriu a caixa 5:" );
				caixa5 = "X";
				if(x5 == 1) {
					jogador.pegarCogumelo();
					x5 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x5 == 2) {
					jogador.pegarPena();
					x5 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x5 == 3) {
					jogador.pegarFogo();
					x5 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x5 == 4){
					jogador.pegarDano();
					x5 = 0;
					caixa += 1;
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				else if(x5 == 0) {
					System.out.println("Essa caixa já foi aberta!" );
					mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
				}
				System.out.println("Total de pontos: " +jogador.mostrarPontos());
			}
			else {
				System.out.println("Você não digitou um valor válido!");
				System.out.println("Digite um valor entre 1 e 5.");
				mostrarCaixas(caixa1, caixa2, caixa3, caixa4, caixa5);
			}
			if (caixa <= 4) {
				System.out.print("Tente outra caixa: ");
				}
			}
		}
		catch(Exception ex) {
			System.out.println("---");
			System.out.println("E R R O!");
			System.out.println("Você não digitou um valor inteiro, inicie o jogo novamente.");
			System.exit(0);
		}
		System.out.println("");
		System.out.println("---");
		System.out.println("");
		System.out.println("PARABÉNS! Todas as caixas foram abertas e VOCÊ SOBREVIVEU!");
		System.out.println("Total de pontos: " +jogador.mostrarPontos());
		entrada.close();
	}
}
