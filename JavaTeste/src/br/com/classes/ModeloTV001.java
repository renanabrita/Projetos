package br.com.classes;

public class ModeloTV001 extends TV implements ControleRemoto {

	public final String MODELO = "TV001";

	@Override
	public void mudarCanal(int canal) {
		// TODO Auto-generated method stub
	}

	@Override
	public void aumentarVolume(int taxa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void diminuirVolume(int taxa) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean ligar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean desligar() {
		// TODO Auto-generated method stub
		return false;
	}

}
