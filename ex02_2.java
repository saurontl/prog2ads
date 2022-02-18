//Escreva um programa que solicite o resultado de algum cálculo. 
//E enquanto o usuário não acertar este cálculo, o programa solicite uma nova resposta. 
//Só quando o resultado digitado for o correto, a mensagem "parabéns!" seja apresentada.

import java.util.Locale;
import java.util.Scanner;
public class ex02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in); entrada.useLocale(Locale.US);
		System.out.println("Digite um valor: ");
		int valor1 = entrada.nextInt();
		System.out.println("Digite outro valor: ");
		int valor2 = entrada.nextInt();
		System.out.println("Agora o que deseja fazer com os dois números:");
		System.out.println("SOMAR, SUBTRAIR, MULTIPLICAR ou DIVIDIR?");
		String operador = entrada.next().toUpperCase();
		while(!operador.equals("SOMAR") && !operador.equals("SUBTRAIR") && !operador.equals("MULTIPLICAR") && !operador.equals("DIVIDIR")) {
			System.out.println("Erro! Você digitou " +operador+ ". Digite SOMAR, SUBTRAIR, MULTIPLICAR ou DIVIDIR.");
			operador = entrada.next().toUpperCase();
		}
		if (operador.equals("SOMAR")) {
			System.out.println("Quanto é " +valor1+ " + " +valor2+ "?");
			int resposta = entrada.nextInt();
			while(resposta != (valor1 + valor2)) {
				System.out.println("Errado! Você disse " +resposta+ ". Tente novamente. Quanto é " +valor1+ " + " +valor2+ "?");
				resposta = entrada.nextInt();
			} 
			System.out.println("Parabéns, você acertou! " +valor1+ " + " +valor2+ " = " +resposta+ ".");
		}
		if(operador.equals("SUBTRAIR")) {
			System.out.println("Quanto é " +valor1+ " - " +valor2+ "?");
			int resposta = entrada.nextInt();
			while(resposta != (valor1 - valor2)) {
				System.out.println("Errado! Você disse " +resposta+ ", tente novamente. Quanto é " +valor1+ " - " +valor2+ "?");
				resposta = entrada.nextInt();
			}
			System.out.println("Parabéns, você acertou! " +valor1+ " - " +valor2+ " = " +resposta+ ".");
		}
		if(operador.equals("MULTIPLICAR")) {
			System.out.println("Quanto é " +valor1+ " x " +valor2+ "?");
			int resposta = entrada.nextInt();
			while(resposta != (valor1 * valor2)) {
				System.out.println("Errado! você disse " +resposta+ ", tente novamente. Quanto é " +valor1+ " x " +valor2+ "?");
				resposta = entrada.nextInt();
			}
			System.out.println("Parabéns, você acertou! " +valor1+ " x " +valor2+ " = " +resposta+ ".");
		}
		if(operador.equals("DIVIDIR")) {
			System.out.println("Quanto é " +valor1+ " / " +valor2+ "?");
			double resultado = ((double)valor1 / valor2);
			double resposta = entrada.nextDouble();
			while(resposta != resultado) {
				System.out.println("Errado! Você disse " +resposta+ ", tente novamente. Quanto é " +valor1+ " / " +valor2+ "?");
				resposta = entrada.nextDouble();
			}
			System.out.println("Parabéns, você acertou! " +valor1+ " / " +valor2+ " = " +resposta+ ".");
		}
		entrada.close();
	}		
}
