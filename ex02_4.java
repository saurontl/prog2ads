//Escreva um programa que solicite o resultado de algum cálculo. 
//E enquanto o usuário não acertar este cálculo, o programa solicite uma nova resposta. 
//Só quando o resultado digitado for o correto, a mensagem "parabéns!" seja apresentada.

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class ex02_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in); entrada.useLocale(Locale.US);
		System.out.println("Tá sem o que fazer? Vamos jogar!");
		System.out.println("Aqui você precisará acertar o resultado de algum cálculo.");
		System.out.println("Você prefere digitar os valores ou quer quer sortear a operação?");
		System.out.println("Digite: SETAR ou SORTEAR.");
		String modo = entrada.next().toUpperCase();
		while(!modo.equals("SETAR") && !modo.equals("SORTEAR")) {
			System.out.println("Erro! Você digitou " +modo+ ". Digite SETAR ou SORTEAR.");
			modo = entrada.next().toUpperCase();
		}
		switch(modo) {
			case "SETAR": {
				System.out.println("Digite um valor: ");
				int valor1 = entrada.nextInt();
				System.out.println("Digite outro valor: ");
				int valor2 = entrada.nextInt();
				System.out.println("Agora digite o que deseja fazer com os dois números:");
				System.out.println("SOMAR, SUBTRAIR, MULTIPLICAR ou DIVIDIR?");
				String operador = entrada.next().toUpperCase();
				while(!operador.equals("SOMAR") && !operador.equals("SUBTRAIR") && !operador.equals("MULTIPLICAR") && !operador.equals("DIVIDIR")) {
					System.out.println("Erro! Você digitou " +operador+ ". Digite SOMAR, SUBTRAIR, MULTIPLICAR ou DIVIDIR.");
					operador = entrada.next().toUpperCase();
				}
				switch(operador) {
					case "SOMAR": {
						System.out.println("Quanto é " +valor1+ " + " +valor2+ "?");
						int resposta = entrada.nextInt();
						while(resposta != (valor1 + valor2)) {
							System.out.println("Errado! Você disse " +resposta+ ". Tente novamente. Quanto é " +valor1+ " + " +valor2+ "?");
							resposta = entrada.nextInt();
						} 
						System.out.println("Parabéns, você acertou! " +valor1+ " + " +valor2+ " = " +resposta+ ".");
					}
					case "SUBTRAIR": {
						System.out.println("Quanto é " +valor1+ " - " +valor2+ "?");
						int resposta = entrada.nextInt();
						while(resposta != (valor1 - valor2)) {
							System.out.println("Errado! Você disse " +resposta+ ", tente novamente. Quanto é " +valor1+ " - " +valor2+ "?");
							resposta = entrada.nextInt();
						}
						System.out.println("Parabéns, você acertou! " +valor1+ " - " +valor2+ " = " +resposta+ ".");
					}
					case "MULTIPLICAR": {
						System.out.println("Quanto é " +valor1+ " x " +valor2+ "?");
						int resposta = entrada.nextInt();
						while(resposta != (valor1 * valor2)) {
							System.out.println("Errado! você disse " +resposta+ ", tente novamente. Quanto é " +valor1+ " x " +valor2+ "?");
							resposta = entrada.nextInt();
						}
						System.out.println("Parabéns, você acertou! " +valor1+ " x " +valor2+ " = " +resposta+ ".");
					}
					case "DIVIDIR": {
						System.out.println("Quanto é " +valor1+ " / " +valor2+ "?");
						double resultado = ((double)valor1 / valor2);
						double resposta = entrada.nextDouble();
						while(resposta != resultado) {
							System.out.println("Errado! Você disse " +resposta+ ", tente novamente. Quanto é " +valor1+ " / " +valor2+ "?");
							resposta = entrada.nextDouble();
						}
						System.out.println("Parabéns, você acertou! " +valor1+ " / " +valor2+ " = " +resposta+ ".");
					}	
				}
			}
			case "SORTEAR": {
				Random sortear = new Random();
				int valor1 = sortear.nextInt(11);
				int valor2 = sortear.nextInt(11);
				int operacao = sortear.nextInt(4) +1;
				switch(operacao) {
					case 1: {
						System.out.println("SOMA!");
						System.out.println("Quanto é " +valor1+ " + " +valor2+ "?");
						int resposta = entrada.nextInt();
						while(resposta != (valor1 + valor2)) {
							System.out.println("Erro! Você digitou " +resposta + ", tente novamente. Quanto é " +valor1+ " + " +valor2+ "?");
							resposta = entrada.nextInt();
						}
						System.out.println("Parabéns, você acertou! " +valor1+ " + " +valor2+ " = " +resposta+ ".");
						break;
					}
					case 2: {
						System.out.println("SUBTRAÇÃO!");
						System.out.println("Quanto é " +valor1+ " - " +valor2+ "?");
						int resposta = entrada.nextInt();
						while(resposta != (valor1 - valor2)) {
							System.out.println("Erro! Você digitou " +resposta + ", tente novamente. Quanto é " +valor1+ " - " +valor2+ "?");
							resposta = entrada.nextInt();
						}
						System.out.println("Parabéns, você acertou! " +valor1+ " - " +valor2+ " = " +resposta+ ".");
						break;
					}
					case 3: {
						System.out.println("MULTIPLICAÇÃO!");
						System.out.println("Quanto é " +valor1+ " x " +valor2+ "?");
						int resposta = entrada.nextInt();
						while(resposta != (valor1 * valor2)) {
							System.out.println("Erro! Você digitou " +resposta+ ", tente novamente. Quanto é " +valor1+ " x " +valor2+ "?");
							resposta = entrada.nextInt();
						}
						System.out.println("Parabéns, você acertou! " +valor1+ " x " +valor2+ " = " +resposta+ ".");
						break;
					}
					case 4: {
						System.out.println("DIVISÃO!");
						System.out.println("Quanto é " +valor1+ " / " +valor2+ "?");
						double resultado = ((double)valor1 / valor2);
						double resposta = entrada.nextDouble();
						while(resultado != resposta) {
							System.out.println("Erro! Você digitou " +resposta+ ", tente novamente. Quanto é " +valor1+ " / " +valor2+ "?");
							resposta = entrada.nextDouble();
						}
						System.out.println("Parabéns, você acertou! " +valor1+ " / " +valor2+ " = " +resposta+ ".");
						break;
					}
				}
			}
			entrada.close();
		}		
	}
}
