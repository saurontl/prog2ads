//Escreva um programa que solicite o resultado de algum c�lculo. 
//E enquanto o usu�rio n�o acertar este c�lculo, o programa solicite uma nova resposta. 
//S� quando o resultado digitado for o correto, a mensagem "parab�ns!" seja apresentada.

import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quando � 2 + 2?");
		int resposta = entrada.nextInt();
		while(resposta != 4) {
			System.out.println("Errado! Voc� disse " +resposta+ ". Tente novamente. Quando � 2 + 2?");
			resposta = entrada.nextInt();
		} 
		System.out.println("Parab�ns! Voc� disse " +resposta+ ".");
		entrada.close();
	}
}
