//Escreva um programa que solicite o resultado de algum c�lculo. 
//E enquanto o usu�rio n�o acertar este c�lculo, o programa solicite uma nova resposta. 
//S� quando o resultado digitado for o correto, a mensagem "parab�ns!" seja apresentada.

import java.util.Scanner;
public class ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor1 = entrada.nextInt();
		System.out.println("Digite outro valor: ");
		int valor2 = entrada.nextInt();
		System.out.println("Quanto � " +valor1+ " + " +valor2+ "?");
		int resposta = entrada.nextInt();
		while(resposta != (valor1 + valor2)) {
			System.out.println("Errado! Voc� disse " +resposta+ ". Tente novamente. Quanto � " +valor1+ " + " +valor2+ "?");
			resposta = entrada.nextInt();
		} 
		System.out.println("Parab�ns! " +valor1+ " + " +valor2+ " = " +resposta+ ".");
		entrada.close();
	}
}
