
public class MarioGrande extends Mario implements status {
	
	public status getCogumelo() {
		System.out.println("Mario estava GRANDE e pegou um COGUMELO!");
		System.out.println("PARAB�NS! Voc� ganhou 1000 pontos!");
		return new MarioGrande();
	}
	public String getPontos() {
		return "MG";
	}
	public status getPena() {
		System.out.println("Mario estava GRANDE e pegou uma PENA!");
		System.out.println("Agora Mario est� com uma CAPA.");
		return new MarioPena();
	}
	public status getFogo() {
		System.out.println("Mario estava GRANDE e pegou uma FLOR!");
		System.out.println("Agora Mario est� atirando FOGO.");
		return new MarioFogo();
	}
	public status getDano() {
		System.out.println("Mario estava GRANDE e sofreu um DANO!");
		System.out.println("Agora Mario est� PEQUENO.");
		return new MarioPequeno();
	}
}
 