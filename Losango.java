
package br.usjt.arqdesis.exercicio;

/**
 * @author Rafael Palazon * 
 *
 */
public class Losango extends Poligono {

	double base;
	double altura;
	

	public Losango(double base, double altura)
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
	public double perimetro() {
		return (4*base);
	}

}
