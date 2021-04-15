package HerancasAnimais2;

public class Cachorro extends herancasAnimais {

	private String late;

	public Cachorro(int idade, String nome, String late) {
		super(idade, nome);
		this.late = late;
	}

	public String getLate() {
		return late;
	}

	public void setLate(String late) {
		this.late = late;
	}

	@Override
	public String toString() {
		return "Cachorro late: " + late + ", Idade: " + getIdade() + ", Nome: " + getNome();
	}

}
