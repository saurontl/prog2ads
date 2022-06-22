package Entidades;

public class PontoColeta {

	private String nome;
	private String bairro;
	private String endereco;
	private int coordenadaX;
	private int coordenadaY;
	private boolean hasPapel = false;
	private boolean hasVidro = false;
	private boolean hasPlastico = false;
	private boolean hasMetal = false;
	private boolean hasOrganico = false;

	public PontoColeta(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(int codBairro) {
		switch (codBairro) {
		case 1:
			bairro = "Jatobá";
			setCoordenadaX(3);
			setCoordenadaY(5);
			break;
		case 2:
			bairro = "Monte Castelo";
			setCoordenadaX(3);
			setCoordenadaY(4);
			break;
		case 3:
			bairro = "Centro";
			setCoordenadaX(3);
			setCoordenadaY(3);
			break;
		case 4:
			bairro = "Maternidade";
			setCoordenadaX(2);
			setCoordenadaY(3);
			break;
		case 5:
			bairro = "Bivar Olinto";
			setCoordenadaX(1);
			setCoordenadaY(3);
			break;
		case 6:
			bairro = "Brasília";
			setCoordenadaX(4);
			setCoordenadaY(3);
			break;
		case 7:
			bairro = "Salgadinho";
			setCoordenadaX(5);
			setCoordenadaY(3);
			break;
		case 8:
			bairro = "Belo Horizonte";
			setCoordenadaX(3);
			setCoordenadaY(2);
			break;
		case 9:
			bairro = "Novo Horizonte";
			setCoordenadaX(3);
			setCoordenadaY(1);
			break;
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public boolean isHasPapel() {
		return hasPapel;
	}

	public void setHasPapel(boolean hasPapel) {
		this.hasPapel = hasPapel;
	}

	public boolean isHasVidro() {
		return hasVidro;
	}

	public void setHasVidro(boolean hasVidro) {
		this.hasVidro = hasVidro;
	}

	public boolean isHasPlastico() {
		return hasPlastico;
	}

	public void setHasPlastico(boolean hasPlastico) {
		this.hasPlastico = hasPlastico;
	}

	public boolean isHasMetal() {
		return hasMetal;
	}

	public void setHasMetal(boolean hasMetal) {
		this.hasMetal = hasMetal;
	}

	public boolean isHasOrganico() {
		return hasOrganico;
	}

	public void setHasOrganico(boolean hasOrganico) {
		this.hasOrganico = hasOrganico;
	}

}
