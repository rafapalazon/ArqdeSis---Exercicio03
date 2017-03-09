
package br.usjt.arqdesis.exercicio;

/**
 * @author Rafael Palazon * 
 *
 */
public class Quadrado extends Poligono implements Diagonal {

	double lado;
	double diagonal;
	
	/**
	 * 
	 */
	public Quadrado(double lado)
	{
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public double area() {
		return Math.pow(lado, 2);
	}


	@Override
	public double calculaDiagonal() {
		return diagonal = (lado*Math.sqrt(2));
	}

	@Override
	public double perimetro() {
		return (4*lado);
	}

}
