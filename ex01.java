//01 - Escreva um programa que leia 5 n�meros e que escreva na tela apenas os que forem �mpares

import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		for(int i = 1; i < 11; i++) {
			System.out.println("Teste " +i+ ", digite um valor: ");
			num = entrada.nextInt();
			if((num % 2) != 0 ) {
				System.out.println("O n�mero " +num + " � �mpar.");
			}
		}
		entrada.close();
	}
}
