package PooHierarquia;

public class Cachorro extends hierarquiasAnimais {
	
	private String latir;
	public Cachorro (String nome, int idade, String latir) {
		
		super (nome, idade);
		
		this.latir = latir;
	}
	public String getLatir() {
		return latir;
	}
	public void setLatir(String latir) {
		this.latir = latir;
	}

}
