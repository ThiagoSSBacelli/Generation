package PooHierarquia;

public class Preguica extends hierarquiasAnimais {
	
	private String dorme;
	public Preguica (String nome, int idade, String dorme) {
		
		super (nome, idade);
		
		this.dorme = dorme;
	}
	public String getLatir() {
		return dorme;
	}
	public void setLatir(String latir) {
		this.dorme = dorme;
	}

}
