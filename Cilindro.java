package br.usjt.arqdesis.exercicio;

public class Cilindro extends Circulo implements Volume{

	double altura;

	public Cilindro(double raio) {
		super(raio);
	}

	@Override
	public double calculaVolume() {
		return Math.PI*Math.pow(raio, 3)*altura;
	}

}
