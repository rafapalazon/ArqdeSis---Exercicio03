
package br.usjt.arqdesis.exercicio;

/**
 * @author Rafael Palazon * 
 *
 */
public class Retangulo extends Poligono implements Diagonal{

	double base;
	double altura;
	double diagonal;
	/**
	 * 
	 */
	public Retangulo(double base, double altura) 
	{
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return (base*altura);
	}

	@Override
	public double calculaDiagonal() {
		return diagonal = (Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2)));
	}

	@Override
	public double perimetro() {
		return ((2*base)+(2*altura));
	}

}
