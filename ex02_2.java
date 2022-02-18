//Escreva um programa que solicite o resultado de algum c�lculo. 
//E enquanto o usu�rio n�o acertar este c�lculo, o programa solicite uma nova resposta. 
//S� quando o resultado digitado for o correto, a mensagem "parab�ns!" seja apresentada.

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
		System.out.println("Agora o que deseja fazer com os dois n�meros:");
		System.out.println("SOMAR, SUBTRAIR, MULTIPLICAR ou DIVIDIR?");
		String operador = entrada.next().toUpperCase();
		while(!operador.equals("SOMAR") && !operador.equals("SUBTRAIR") && !operador.equals("MULTIPLICAR") && !operador.equals("DIVIDIR")) {
			System.out.println("Erro! Voc� digitou " +operador+ ". Digite SOMAR, SUBTRAIR, MULTIPLICAR ou DIVIDIR.");
			operador = entrada.next().toUpperCase();
		}
		if (operador.equals("SOMAR")) {
			System.out.println("Quanto � " +valor1+ " + " +valor2+ "?");
			int resposta = entrada.nextInt();
			while(resposta != (valor1 + valor2)) {
				System.out.println("Errado! Voc� disse " +resposta+ ". Tente novamente. Quanto � " +valor1+ " + " +valor2+ "?");
				resposta = entrada.nextInt();
			} 
			System.out.println("Parab�ns, voc� acertou! " +valor1+ " + " +valor2+ " = " +resposta+ ".");
		}
		if(operador.equals("SUBTRAIR")) {
			System.out.println("Quanto � " +valor1+ " - " +valor2+ "?");
			int resposta = entrada.nextInt();
			while(resposta != (valor1 - valor2)) {
				System.out.println("Errado! Voc� disse " +resposta+ ", tente novamente. Quanto � " +valor1+ " - " +valor2+ "?");
				resposta = entrada.nextInt();
			}
			System.out.println("Parab�ns, voc� acertou! " +valor1+ " - " +valor2+ " = " +resposta+ ".");
		}
		if(operador.equals("MULTIPLICAR")) {
			System.out.println("Quanto � " +valor1+ " x " +valor2+ "?");
			int resposta = entrada.nextInt();
			while(resposta != (valor1 * valor2)) {
				System.out.println("Errado! voc� disse " +resposta+ ", tente novamente. Quanto � " +valor1+ " x " +valor2+ "?");
				resposta = entrada.nextInt();
			}
			System.out.println("Parab�ns, voc� acertou! " +valor1+ " x " +valor2+ " = " +resposta+ ".");
		}
		if(operador.equals("DIVIDIR")) {
			System.out.println("Quanto � " +valor1+ " / " +valor2+ "?");
			double resultado = ((double)valor1 / valor2);
			double resposta = entrada.nextDouble();
			while(resposta != resultado) {
				System.out.println("Errado! Voc� disse " +resposta+ ", tente novamente. Quanto � " +valor1+ " / " +valor2+ "?");
				resposta = entrada.nextDouble();
			}
			System.out.println("Parab�ns, voc� acertou! " +valor1+ " / " +valor2+ " = " +resposta+ ".");
		}
		entrada.close();
	}		
}
