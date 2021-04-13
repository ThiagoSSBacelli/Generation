package projetoModulo1;

public abstract class Pessoa {

	private String nome;
	private String tipo; // Preenche com professor, aluno, diretoria ou pais
	private String turma;
	private int idade;
	private int senha;
	private int id;

	public Pessoa() {

	}

	public Pessoa(int id, String nome, String tipo, String truma, int idade, int senha) {

		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		this.senha = senha;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
