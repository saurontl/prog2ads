
public class MarioPena extends Mario implements status {
	
	public status getCogumelo() {
		System.out.println("Mario estava com uma CAPA e pegou um COGUMELO!");
		System.out.println("PARAB�NS! Voc� ganhou 1000 pontos!");
		return new MarioPena();
	}
	public String getPontos() {
		return "MP";
	}
	public status getPena() {
		System.out.println("Mario estava com uma CAPA e pegou uma PENA!");
		System.out.println("PARAB�NS! Voc� ganhou 1000 pontos!");
		return new MarioPena();
	}
	public status getFogo() {
		System.out.println("Mario estava com uma CAPA e pegou uma FLOR!");
		System.out.println("Agora Mario est� atirando FOGO.");
		return new MarioFogo();
	}
	public status getDano() {
		System.out.println("Mario estava com uma CAPA e sofreu um DANO!");
		System.out.println("Agora Mario est� GRANDE.");
		return new MarioGrande();
	}
}
