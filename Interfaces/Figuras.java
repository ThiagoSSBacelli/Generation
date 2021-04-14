package Interfaces;

public interface Figuras {

	public String nomeInterface = "Figuras";

	abstract public String getnome();

	abstract public void setNome(String nome);

	public double getArea();

	public double getPerimetro();

	double getDiagonal();

}
