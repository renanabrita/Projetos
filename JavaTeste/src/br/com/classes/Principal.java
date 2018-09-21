package br.com.classes;

public class Principal {

	public static void main(String[] args) {

		ModeloTV001 tv1 = new ModeloTV001();
		tv1.setMarca("LG");
		tv1.aumentarVolume(10);
		
		ModeloX tv2 = new ModeloX();

		tv1.ligar();
		tv2.ligar();
		

		/*System.out.print("TV1 - modelo " + tv1.MODELO + " está ");
		System.out.println(tv1.isLigada() ? "ligada" : "desligada");
		System.out.print("TV2 - modelo " + tv2.MODELO + " está ");
		System.out.println(tv1.isLigada() ? "ligada" : "desligada");
		// ambas as TVs estão ligadas e vamos desligá-las
		System.out.println("Desligando modelo " + tv1.MODELO);
		tv1.desligar();
		System.out.println("Desligando modelo " + tv2.MODELO);
		tv2.desligar();*/
	}

}
