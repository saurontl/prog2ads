
public class MarioFogo extends Mario implements status {
	
	public status getCogumelo() {
		System.out.println("Mario estava atirando FOGO e pegou um COGUMELO!");
		System.out.println("PARABÉNS! Você ganhou 1000 pontos!");
		return new MarioFogo();
	}
	public String getPontos() {
		return "MF";
	}
	public status getPena() {
		System.out.println("Mario estava atirando FOGO e pegou uma PENA!");
		System.out.println("Agora Mario está com uma CAPA.");
		return new MarioPena();
	}
	public status getFogo() {
		System.out.println("Mario estava atirando FOGO e pegou uma FLOR!");
		System.out.println("PARABÉNS! Você ganhou 1000 pontos!");
		return new MarioFogo();
	}
	public status getDano() {
		System.out.println("Mario estava atirando FOGO e sofreu um DANO!");
		System.out.println("Agora Mario está GRANDE.");
		return new MarioGrande();
	}
}
