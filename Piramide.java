
package br.usjt.arqdesis.exercicio;

/**
 * @author Rafael Palazon * 
 *
 */
public class Piramide extends Cubo implements Volume {

	
	@Override
	public double calculaVolume() {
		return ((1/3)*(comprimento*largura*altura));
	}

}
