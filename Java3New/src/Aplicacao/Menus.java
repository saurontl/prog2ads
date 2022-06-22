package Aplicacao;

public class Menus {
	public static void menuPrincipal() {
		System.out.println("- ReciclaPatos -");
		System.out.println("Escolha a opção abaixo que você deseja:");
		System.out.println("1 - Cadastrar Ponto de Coleta");
		System.out.println("2 - Encontrar Ponto de Coleta");
		System.out.print("> ");
	}

	public static void menuMaterial() {
		System.out.println("Informe o material a ser coletado:");
		System.out.println("1 - Plástico");
		System.out.println("2 - Vidro");
		System.out.println("3 - Papel");
		System.out.println("4 - Metal");
		System.out.println("5 - Orgânico");
		System.out.println("---");
		System.out.println("6 - Finalizar cadastro e voltar ao menu principal");
		System.out.print("> ");
	}

	public static void menuBairro() {
		System.out.println("Informe o bairro onde será coletado:");
		System.out.println("1 - Jatobá");
		System.out.println("2 - Monte Castelo");
		System.out.println("3 - Centro");
		System.out.println("4 - Maternidade");
		System.out.println("5 - Bivar Olinto");
		System.out.println("6 - Brasília");
		System.out.println("7 - Salgadinho");
		System.out.println("8 - Belo Horizonte");
		System.out.println("9 - Novo Horizonte");
		System.out.print("> ");
	}

	public static void menuEncontrar() {
		System.out.println("Informe o bairro de origem:");
		System.out.println("1 - Jatobá");
		System.out.println("2 - Monte Castelo");
		System.out.println("3 - Centro");
		System.out.println("4 - Maternidade");
		System.out.println("5 - Bivar Olinto");
		System.out.println("6 - Brasília");
		System.out.println("7 - Salgadinho");
		System.out.println("8 - Belo Horizonte");
		System.out.println("9 - Novo Horizonte");
	}
}
