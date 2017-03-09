
package br.usjt.arqdesis.exercicio;

/**
 * @author Rafael Palazon * 
 *
 */
public class Triangulo extends Poligono {

	
	double base;
	double altura;
	double lado1;
	double lado2; 
	double lado3;
	
	/**
	 * 
	 */
	public Triangulo(double lado1, double lado2, double lado3, double base, double altura)
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

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public double area() {
		return (base*altura)/2;
	}

	@Override
	public double perimetro() {
		return lado1+lado2+lado3;
	}

}
