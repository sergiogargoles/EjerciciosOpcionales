package src;

import daw.com.*;

public class Ejecutar {
	public static void main(String[] args) {

		int numBoletos = Teclado.leerInt("Introduzca el número de jugadores: ");
		Boleto[] boletos = new Boleto[numBoletos];
		
		
		for (int i = 0; i < boletos.length; i++) {
			boletos[i] = new Boleto();
			System.out.println();
			System.out.println("Boleto " + (i + 1));

			boletos[i].mostrarBoleto();
		}
		System.out.println();
		Bingo.partidaBingo(boletos);
	}

}
