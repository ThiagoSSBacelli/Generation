package Interfaces;

public class SubfiguraQuadrados extends SuperFiguras implements Figuras {

	SubfiguraQuadrados(double lado1, double lado2, String nome) {
		super(lado1, lado2, nome);
		nomeClasse = "SubfiguraQuadrados";
	}

	public double getDiagonal() {
		return Math.sqrt(2) * lado1;
	}

	@Override
	public String getnome() {
		// TODO Auto-generated method stub
		return null;
	}

}
