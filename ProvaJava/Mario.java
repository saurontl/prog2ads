
public class Mario {

	status status;
	int pontos;
	
	public Mario() {
		status = new MarioPequeno();
	}
	
	public int mostrarPontos() {
		return pontos;
	}
	
	public void pegarCogumelo() {
		if(status.getPontos().equals("MG") || status.getPontos().equals("MP") || status.getPontos().equals("MF")) {
			pontos += 1000;
		}
		this.status = status.getCogumelo();
		
	}
	
	public void pegarPena() {
		if(status.getPontos().equals("MP")) {
			pontos += 1000;
		}
		this.status = status.getPena();
	}
	
	public void pegarFogo() {
		if(status.getPontos().equals("MF")) {
			pontos += 1000;
		}
		this.status = status.getFogo();
	}
	
	public void pegarDano() {
		this.status = status.getDano();
	}
}
