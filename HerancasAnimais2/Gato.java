package HerancasAnimais2;

public class Gato extends herancasAnimais {

	private String mia;

	
	public Gato(int idade, String nome, String mia) {
		super(idade, nome);
		this.mia = mia;

	}

	public String getMia() {
		return mia;
	}

	public void setMia(String mia) {
		this.mia = mia;
	}

	@Override
	public String toString() {
		return "Gato mia: " + mia + " Idade: " + getIdade() + " Nome: " + getNome();
	}


}
