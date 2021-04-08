package PooHierarquia;

public class Cavalo extends hierarquiasAnimais {
	
	private String relinchar;
	public Cavalo (String nome, int idade, String relinchar) {
		
		super (nome, idade);
		
		this.relinchar = relinchar;
	}
	public String getLatir() {
		return relinchar;
	}
	public void setLatir(String latir) {
		this.relinchar = relinchar;
	}

}