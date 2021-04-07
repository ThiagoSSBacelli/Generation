package PrimeiraAulaPOO;

public class ClasseAvioes/*o tal do construtor*/ {
	
	private String modelo;
	private String linha;
	private int capacidade;
	
	public ClasseAvioes /*o tal do construtor*/(String modelo, String linha, int capacidade) {
		
		this.modelo = modelo; 
		this.linha = linha;
		this.capacidade = capacidade;
	}
	public void voar() {
		
		//System.out.println("Estou em vôo. ");
		//System.out.println("Total de passageiros: " + capacidade);
	}
	public void pousar() {
		//System.out.println("Terra a vista: ");
	}
	public void ler() {
		//System.out.printf("modelodo do avião é: %d, a linha é: %d, e sua capacidade é: %d ", modelo, linha, capacidade);
		System.out.println("modelodo do avião é:" + modelo + "\n a linha é: "+ linha + "\n e sua capacidade é: " + capacidade + "sentados");
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getLinha() {
		return linha;
	}
	public void setLinha(String linha) {
		this.linha = linha;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	

}
