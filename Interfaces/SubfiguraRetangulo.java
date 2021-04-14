package Interfaces;

public class SubfiguraRetangulo extends SuperFiguras implements Figuras {

	SubfiguraRetangulo(double lado1, double lado2, String nome) {

		super(lado1, lado2, nome);

		nomeClasse = "SubfiguraRetangulo";

	}

	public double getDiagonal() {

		return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
	}

	@Override
	public String getnome() {
		// TODO Auto-generated method stub
		return null;
	}

}
