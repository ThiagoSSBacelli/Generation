package PrimeiraAulaPOO;

public class ClasseEletronicos /*o tal do construtor*/{
	
	private String celular;
	private String fone;
	private String carregador;
	
	public ClasseEletronicos (String celular, String fone, String carregador) {
		
		this.celular = celular;
		this.fone = fone;
		this.carregador = carregador;
	}
	
	public void celular() {
		
	}
	public void fone() {
		
	}
	public void ler(){
		
		System.out.println("Eu tenho um celular da " + celular + " com um fone da " + fone + " com um carregador do tipo " + carregador);
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCarregador() {
		return carregador;
	}

	public void setCarregador(String carregador) {
		this.carregador = carregador;
	}

	
	
}
