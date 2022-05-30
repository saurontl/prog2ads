
public class MarioPequeno implements status {
	
	public status getCogumelo() {
		System.out.println("Mario estava PEQUENO e pegou um COGUMELO!");
		System.out.println("Agora Mario está GRANDE.");
		return new MarioGrande();
	}
	public String getPontos() {
		return "MPEQ";
	}
	public status getPena() {
		System.out.println("Mario estava PEQUENO e pegou um PENA!");
		System.out.println("Agora Mario está GRANDE e com CAPA.");		
		return new MarioPena();
	}
	public status getFogo() {
		System.out.println("Mario estava PEQUENO e pegou uma FLOR!");
		System.out.println("Agora Mario está GRANDE e atirando FOGO.");
		return new MarioFogo();
	}
	public status getDano() {
		System.out.println("Você estava PEQUENO e sofreu um DANO!");
		System.out.println("Infelizmente você MORREU.");
		System.out.println("--- GAME OVER ---");
		System.exit(0);
		return null;
	}
}