//Escreva um programa que solicite o resultado de algum cálculo. 
//E enquanto o usuário não acertar este cálculo, o programa solicite uma nova resposta. 
//Só quando o resultado digitado for o correto, a mensagem "parabéns!" seja apresentada.

import java.util.Scanner;
public class ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor1 = entrada.nextInt();
		System.out.println("Digite outro valor: ");
		int valor2 = entrada.nextInt();
		System.out.println("Quanto é " +valor1+ " + " +valor2+ "?");
		int resposta = entrada.nextInt();
		while(resposta != (valor1 + valor2)) {
			System.out.println("Errado! Você disse " +resposta+ ". Tente novamente. Quanto é " +valor1+ " + " +valor2+ "?");
			resposta = entrada.nextInt();
		} 
		System.out.println("Parabéns! " +valor1+ " + " +valor2+ " = " +resposta+ ".");
		entrada.close();
	}
}
