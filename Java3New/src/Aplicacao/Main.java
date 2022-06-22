package Aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.PontoColeta;
import Utilitarios.CheckMaterial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<PontoColeta> dados = new ArrayList<PontoColeta>();

		int entrada;
		Menus.menuPrincipal();
		Scanner input = new Scanner(System.in);
		entrada = input.nextInt();
		while (true) {
			
			while (entrada != 1 && entrada != 2) {
				System.out.println("Tente novamente!");
				System.out.println("---");
				Menus.menuPrincipal();
				entrada = input.nextInt();
			}

			if (entrada == 1) {

				System.out.println("");
				System.out.print("Informe o seu nome: ");
				input.nextLine();
				String nome = input.nextLine();
				System.out.print("Informe o nome da rua e número: ");
				String endereco = input.nextLine();
				PontoColeta pc = new PontoColeta(nome, endereco);
				System.out.println("");
				Menus.menuBairro();
				int bairro = input.nextInt();
				pc.setBairro(bairro);
				boolean condicao = true;
				while (condicao) {
					Menus.menuMaterial();
					int material = input.nextInt();
					switch (material) {
					case 1:
						pc.setHasPlastico(true);
						System.out.println("Material cadastrado: Plástico.");
						break;
					case 2:
						pc.setHasVidro(true);
						System.out.println("Material cadastrado: Vidro.");
						break;
					case 3:
						pc.setHasPapel(true);
						System.out.println("Material cadastrado: Papel.");
						break;
					case 4:
						pc.setHasMetal(true);
						System.out.println("Material cadastrado: Metal.");
						break;
					case 5:
						pc.setHasOrganico(true);
						System.out.println("Material cadastrado: Orgânico.");
						break;
					default:
						condicao = false;
					}
				}
				dados.add(pc);
				System.out.println("Cadastro concluído com sucesso!");
				System.out.println("Nome: " + pc.getNome());
				System.out.println("Endereço: " + pc.getEndereco() + " - " + pc.getBairro());
				System.out.println("Materiais coletados: ");
				if (pc.isHasPlastico()) {
					System.out.println("- Plástico");
				}
				if (pc.isHasVidro()) {
					System.out.println("- Vidro");
				}
				if (pc.isHasPapel()) {
					System.out.println("- Papel");
				}
				if (pc.isHasMetal()) {
					System.out.println("- Metal");
				}
				if (pc.isHasOrganico()) {
					System.out.println("- Orgânico");
				}
				System.out.println("---");
				Menus.menuPrincipal();
				entrada = input.nextInt();
			}
			if (entrada == 2) {
				System.out.println("Informe que tipo de material você descartar: ");
				System.out.println("1 - Plástico");
				System.out.println("2 - Vidro");
				System.out.println("3 - Papel");
				System.out.println("4 - Metal");
				System.out.println("5 - Orgânico");
				System.out.print("> ");
				int descarte = input.nextInt();
				CheckMaterial.checar(dados, descarte);
				Menus.menuPrincipal();
				entrada = input.nextInt();
			}
			input.close();
		}
	}
}