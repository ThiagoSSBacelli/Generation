package Interfaces;

public class testaFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubfiguraQuadrados figi1 = new SubfiguraQuadrados(10, 0, "SubfiguraQuadrados");
		SubfiguraRetangulo figi2 = new SubfiguraRetangulo(3, 4, "SubfiguraRetangulo");

		System.out.println(figi1.getNome() + " : " + figi1.getDiagonal());
		System.out.println(figi2.getNome() + " : " + figi2.getDiagonal());
	}

}
