package ProjetoInicial;

	public abstract class Escola {
		
		private String nome;// Isso são atributos
		private String tipo; //Preenche com professor, aluno, diretoria ou pais
		private String turma; // preencher com a turma que o aluno estará
		private int idade;// Isso são atributos
		private int senha;// Isso são atributos
		private int id;// Isso são atributos
		
		public 	Escola() {
			
		}
		
		public Escola(String tipo, int id, int senha, String turma) {
			this.tipo = tipo;
			this.senha = senha;
			this.id = id;
			this.turma = turma;
		}
		
		public Escola(String nome, String tipo, String turma, int idade, int senha, int id) {
			
			this.nome = nome;
			this.tipo = tipo;
			this.idade = idade;
			this.senha = senha;
			this.id = id;
			this.turma = turma;
		}
		
		abstract public void feedbackProfessor();
		
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
		public String getturma() {
			return turma;
		}

		public void setturma(String turma) {
			this.turma = turma;
		}
	}

