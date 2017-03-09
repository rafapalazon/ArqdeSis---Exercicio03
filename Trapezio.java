
package br.usjt.arqdesis.exercicio;

/**
 * @author Rafael Palazon * 
 *
 */
public class Trapezio extends Figura {

	double altura, baseMenor, baseMaior, lado1, lado2;
	/**
	 * 
	 */
	public Trapezio(double altura, double baseMenor, double baseMaior, double lado1, double lado2) {
		this.altura = altura;
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/* (non-Javadoc)
	 * @see br.usjt.ardesis.exercicio.Figura#area()
	 */
	@Override
	public double area() {
		return (altura*(baseMaior + baseMenor))/2;
	}

	/* (non-Javadoc)
	 * @see br.usjt.ardesis.exercicio.Figura#perimetro()
	 */
	@Override
	public double perimetro() {
		return (baseMaior+baseMenor+lado1+lado2);
	}

}
