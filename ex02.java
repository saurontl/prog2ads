//Escreva um programa que solicite o resultado de algum cálculo. 
//E enquanto o usuário não acertar este cálculo, o programa solicite uma nova resposta. 
//Só quando o resultado digitado for o correto, a mensagem "parabéns!" seja apresentada.

import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quando é 2 + 2?");
		int resposta = entrada.nextInt();
		while(resposta != 4) {
			System.out.println("Errado! Você disse " +resposta+ ". Tente novamente. Quando é 2 + 2?");
			resposta = entrada.nextInt();
		} 
		System.out.println("Parabéns! Você disse " +resposta+ ".");
		entrada.close();
	}
}
