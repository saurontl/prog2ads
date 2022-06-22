package Utilitarios;

import java.util.ArrayList;

import Entidades.PontoColeta;

public class CheckMaterial {

	ArrayList<PontoColeta> dados = new ArrayList<PontoColeta>();

	public static void checar(ArrayList<PontoColeta> coleta, int x) {
		boolean achou = false;
		for (int i = 0; i < coleta.size(); i++) {
			if (x == 1 && coleta.get(i).isHasPlastico()) {
				achou = true;
				System.out.println("Nome: " + coleta.get(i).getNome());
				System.out.println("Endereço: " + coleta.get(i).getEndereco() + " - " + coleta.get(i).getBairro());
				System.out.println("Materiais coletados: ");
				if (coleta.get(i).isHasPlastico()) {
					System.out.println("- Plástico");
				}
				if (coleta.get(i).isHasVidro()) {
					System.out.println("- Vidro");
				}
				if (coleta.get(i).isHasPapel()) {
					System.out.println("- Papel");
				}
				if (coleta.get(i).isHasMetal()) {
					System.out.println("- Metal");
				}
				if (coleta.get(i).isHasOrganico()) {
					System.out.println("- Orgânico");
				}
				System.out.println("---");
			}
			if (x == 2 && coleta.get(i).isHasVidro()) {
				achou = true;
				System.out.println("Nome: " + coleta.get(i).getNome());
				System.out.println("Endereço: " + coleta.get(i).getEndereco() + " - " + coleta.get(i).getBairro());
				System.out.println("Materiais coletados: ");
				if (coleta.get(i).isHasPlastico()) {
					System.out.println("- Plástico");
				}
				if (coleta.get(i).isHasVidro()) {
					System.out.println("- Vidro");
				}
				if (coleta.get(i).isHasPapel()) {
					System.out.println("- Papel");
				}
				if (coleta.get(i).isHasMetal()) {
					System.out.println("- Metal");
				}
				if (coleta.get(i).isHasOrganico()) {
					System.out.println("- Orgânico");
				}
				System.out.println("---");
			}
			if (x == 3 && coleta.get(i).isHasPapel()) {
				achou = true;
				System.out.println("Nome: " + coleta.get(i).getNome());
				System.out.println("Endereço: " + coleta.get(i).getEndereco() + " - " + coleta.get(i).getBairro());
				System.out.println("Materiais coletados: ");
				if (coleta.get(i).isHasPlastico()) {
					System.out.println("- Plástico");
				}
				if (coleta.get(i).isHasVidro()) {
					System.out.println("- Vidro");
				}
				if (coleta.get(i).isHasPapel()) {
					System.out.println("- Papel");
				}
				if (coleta.get(i).isHasMetal()) {
					System.out.println("- Metal");
				}
				if (coleta.get(i).isHasOrganico()) {
					System.out.println("- Orgânico");
				}
				System.out.println("---");
			}
			if (x == 4 && coleta.get(i).isHasMetal()) {
				achou = true;
				System.out.println("Nome: " + coleta.get(i).getNome());
				System.out.println("Endereço: " + coleta.get(i).getEndereco() + " - " + coleta.get(i).getBairro());
				System.out.println("Materiais coletados: ");
				if (coleta.get(i).isHasPlastico()) {
					System.out.println("- Plástico");
				}
				if (coleta.get(i).isHasVidro()) {
					System.out.println("- Vidro");
				}
				if (coleta.get(i).isHasPapel()) {
					System.out.println("- Papel");
				}
				if (coleta.get(i).isHasMetal()) {
					System.out.println("- Metal");
				}
				if (coleta.get(i).isHasOrganico()) {
					System.out.println("- Orgânico");
				}
				System.out.println("---");
			}
			if (x == 5 && coleta.get(i).isHasOrganico()) {
				achou = true;
				System.out.println("Nome: " + coleta.get(i).getNome());
				System.out.println("Endereço: " + coleta.get(i).getEndereco() + " - " + coleta.get(i).getBairro());
				System.out.println("Materiais coletados: ");
				if (coleta.get(i).isHasPlastico()) {
					System.out.println("- Plástico");
				}
				if (coleta.get(i).isHasVidro()) {
					System.out.println("- Vidro");
				}
				if (coleta.get(i).isHasPapel()) {
					System.out.println("- Papel");
				}
				if (coleta.get(i).isHasMetal()) {
					System.out.println("- Metal");
				}
				if (coleta.get(i).isHasOrganico()) {
					System.out.println("- Orgânico");
				}
				System.out.println("---");
			}
		}
		if (achou == false) {
			System.out.println("Nenhum ponto encontrado!");
			System.out.println("---");
		}
	}
}
