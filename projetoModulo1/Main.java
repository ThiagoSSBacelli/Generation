package projetoModulo1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 0;
		int senha = 0;
		int sair = 0;
		int op = 0;

		Calendar hoje = Calendar.getInstance();
		// TODO Auto-generated method stub
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		boolean continueLoop = true;
		System.out.println("\n**************ESCOLA PERSISTÊNCIA********************");

		System.out.printf("\t  DATA:%02d/%02d/%02d HORA %02d:%02d \n", dia, (mes + 1), ano, hora, minutos);

		Scanner ler = new Scanner(System.in);
		Alunos aluno = new Alunos();
		Diretoria diretoria1 = new Diretoria();
		Professor prof = new Professor();

		ArrayList<Alunos> listaAlunos = new ArrayList<Alunos>();
		listaAlunos.add(new Alunos(1, "Rodrigo", "Aluno", "Turma20", 25, 23));
		listaAlunos.add(new Alunos(2, "Mauricio", "Aluno", "Turma20", 25, 34));
		listaAlunos.add(new Alunos(3, "Thiago", "Aluno", "Turma20", 25, 45));
		listaAlunos.add(new Alunos(4, "Rivelino", "Aluno", "Turma20", 25, 56));

		ArrayList<Diretoria> listaDiretoria = new ArrayList<Diretoria>();
		listaDiretoria.add(new Diretoria(123, "Fernanda", "diretora", "A", 23, 456));

		ArrayList<Professor> listaProfessor = new ArrayList<Professor>();
		listaProfessor.add(new Professor(1234, "Igor", "professor", "A", 23, 5678));

		do {
			do {
				System.out.println(
						"\nEscolha uma opção a seguir: \n1- Entrar como DIRETORIA \n2- Entrar como PROFESSOR \n3- Entrar como ALUNO ");
				try {
					op = ler.nextInt();
					continueLoop = false;
				}

				catch (InputMismatchException inputMismatchException) {
					System.err.printf("\nException: inputMismatchException");
					ler.nextLine();
					System.out.println("\nVocê deve entrar com uma opção do menu. Por favor tente novamente.\n");

				}
			} while (continueLoop);

			switch (op) {

			case (1):
				boolean continueLoop2 = true;
				do {

					try {
						System.out.println("Entre com login/ID: ");
						id = ler.nextInt();

						System.out.println("Informe sua senha: ");
						senha = ler.nextInt();

						continueLoop2 = false;
					}

					catch (InputMismatchException inputMismatchException) {
						System.err.printf("\nException: inputMismatchException");
						ler.nextLine();
						System.out.println("\nVocê deve entrar com um numero de login e senha válido\n");

					}
				} while (continueLoop2);

				for (Diretoria diretoria2 : listaDiretoria) {

					if (diretoria2.getId() == id && diretoria2.getSenha() == senha) {

						int sair2 = 0;
						boolean continueLoop3 = true;
						do {
							do {

								try {
									System.out.println(

											"Seja bem vind(e), Diretor(e): Fernanda! \n1- Cadastrar novo alun(e) \n2- Ver nota de alun(e) existente \n3- Ir para o menu anterior");
									op = ler.nextInt();
									continueLoop3 = false;
								} catch (InputMismatchException inputMismatchException) {
									System.err.printf("\nException: inputMismatchException");
									ler.nextLine();
									System.out.println(
											"\nVocê deve entrar com uma opção do menu. Por favor tente novamente.\n");

								}

							} while (continueLoop3);

							switch (op) {

							case (1):
								listaAlunos.add(diretoria1.adicionarAluno());
								break;

							case (2):

								for (Alunos aluno1 : listaAlunos) {
									System.out.println("O alun(e) " + aluno1.getNome()
											+ " obteve as seguintes notas: \nNota 1 - " + aluno1.getNota1()
											+ " \nNota 2 - " + aluno1.getNota2() + " \nNota 3 - " + aluno1.getNota3()
											+ " \nMédia - "
											+ ((aluno1.getNota1() + aluno1.getNota2() + aluno1.getNota3()) / 3) + "\n");
								}
								;
								break;

							case (3):
								sair2 = 1;
								break;

							default:
								System.out.println("Digite um número do menu");
								break;
							}
						} while (sair2 == 0);
					}

					else {
						System.out.println("Login ou senha incorreta");
						break;
					}
					;
					break;

				}
				;
				break;

			case 2:
				boolean continueLoop4 = true;
				do {
					try {
						System.out.println("Entre com login/ID: ");

						id = ler.nextInt();

						System.out.println("Informe sua senha: ");
						senha = ler.nextInt();
						continueLoop4 = false;
					} catch (InputMismatchException inputMismatchException) {
						System.err.printf("\nException: inputMismatchException");
						ler.nextLine();
						System.out.println("\nVocê deve entrar com um numero de login e senha válido.\n");

					}

				} while (continueLoop4);

				for (Professor professor1 : listaProfessor) {

					if (professor1.getId() == id && professor1.getSenha() == senha) {

						int sair3 = 0;
						boolean continueLoop5 = true;
						do {
							do {
								try {
									System.out.println(
											"Seja bem vind(e), Professor(e): \n1- Atribuir nota ao alun(e) \n2- Ver nota de alun(e) \n3- Ir para o menu anterior");
									op = ler.nextInt();
									continueLoop5 = false;
								} catch (InputMismatchException inputMismatchException) {
									System.err.printf("\nException: inputMismatchException");
									ler.nextLine();
									System.out.println(
											"\nVocê deve entrar com uma opção do menu. Por favor tente novamente.\n");

								}

							} while (continueLoop5);

							switch (op) {
							case 1:
								int cont = 0;

								for (Alunos aluno1 : listaAlunos) {
									cont++;
									System.out.println(cont + "- " + aluno1.getNome());

								}

								boolean continueLoop6 = true;
								do {
									try {
										System.out.println("Qual aluno deseja adicionar as notas?");

										int index = ler.nextInt();

										System.out.println("Entre com a Nota 1: ");
										float nota1 = ler.nextFloat();

										System.out.println("Entre com a Nota 2: ");
										float nota2 = ler.nextFloat();

										System.out.println("Entre com a Nota 3: ");
										float nota3 = ler.nextFloat();

										if (nota1 > 0 && nota1 < 10) {
											listaAlunos.get(index - 1).setNota1(nota1);
										} else {
											System.out
													.println("Nota 1 não foi adicionada, o número inserido é inválido");
										}

										if (nota2 > 0 && nota2 < 10) {
											listaAlunos.get(index - 1).setNota2(nota2);
										} else {
											System.out
													.println("Nota 2 não foi adicionada, o número inserido é inválido");
										}

										if (nota3 > 0 && nota3 < 10) {
											listaAlunos.get(index - 1).setNota3(nota3);
											break;
										} else {
											System.out
													.println("Nota 3 não foi adicionada, o número inserido é inválido");
										}

										continueLoop6 = false;
										break;

									}

									catch (InputMismatchException inputMismatchException) {
										System.err.printf("\nException: inputMismatchException");
										ler.nextLine();
										System.out.println(
												"\nVocê deve entrar com um numero válido. Por favor tente novamente.\n");

									}

									catch (IndexOutOfBoundsException indexOutOfBoundsException) {
										System.err.printf("\nException: IndexOutOfBoundsException");
										ler.nextLine();
										System.out.println(
												"\nVocê deve entrar com um numero do menu. Por favor tente novamente.\n");

									}

								} while (continueLoop6);
								break;

							case 2:

								for (Alunos aluno1 : listaAlunos) {
									System.out.println("O alun(e) " + aluno1.getNome()
											+ " obteve as seguintes notas: \nNota 1 - " + aluno1.getNota1()
											+ " \nNota 2 - " + aluno1.getNota2() + " \nNota 3 - " + aluno1.getNota3()
											+ " \nMédia - "
											+ ((aluno1.getNota1() + aluno1.getNota2() + aluno1.getNota3()) / 3) + "\n");
								}
								;
								break;

							case 3:
								sair3 = 1;
								break;

							default:
								System.out.println("Digite uma opção do menu");
								break;
							}

						} while (sair3 == 0);
					}

					else {
						System.out.println("Login ou senha incorreta!");
					}

				}
				;
				break;

			case 3:
				boolean continueLoop7 = true;
				do {
					try {
						System.out.println("Entre com login/ID: ");

						id = ler.nextInt();

						System.out.println("Informe sua senha: ");
						senha = ler.nextInt();
						continueLoop7 = false;
					} catch (InputMismatchException inputMismatchException) {
						System.err.printf("\nException: inputMismatchException");
						ler.nextLine();
						System.out.println("\nVocê deve entrar com um numero de login e senha válidos\n");

					}
				} while (continueLoop7);

				int contTotal = 0;
				int contVerificarSenha = 0;
				for (Alunos aluno1 : listaAlunos) {
					contTotal++;
					if (aluno1.getId() == id && aluno1.getSenha() == senha) {
						System.out.println("O alun(e)  " + aluno1.getNome() + " obeteve as seguintes notas: \nNota 1 - "
								+ aluno1.getNota1() + " \nNota 2 - " + aluno1.getNota2() + " \nNota 3 - "
								+ aluno1.getNota3() + " \nMédia - "
								+ ((aluno1.getNota1() + aluno1.getNota2() + aluno1.getNota3()) / 3) + "\n");
					}

					else {
						contVerificarSenha++;
					}
				}

				if (contTotal == contVerificarSenha) {
					System.out.println("Login ou senha incorreta!\n");
				}

				break;
			default:
				System.out.println("Digite uma opção do menu!");

			}

		} while (sair != 9);

	}
}
