
package br.usjt.arqdesis.exercicio;

/**
 * @author Rafael Palazon
 *
 */
public class Cubo implements Volume{

	
	double comprimento, largura, altura;

	@Override
	public double calculaVolume() {
		return (comprimento*largura*altura);
	}

}
