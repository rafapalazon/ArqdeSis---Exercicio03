
package br.usjt.arqdesis.exercicio;

/**
 * @author Rafael Palazon
 *
 */
public class Circulo extends Figura {

	public double raio;
	
	//circulo
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
		
	//area
	@Override
	public double area() {
		return Math.PI* Math.pow(this.raio, 2);
	}

	@Override
	public double perimetro() {
		return (2*Math.PI*raio);
	}

}
