package src;

public class Bingo {

	
	public static int numAleatorio() {
		int numeroDePrueba = -1;
		while (numeroDePrueba <= 0 || numeroDePrueba > 100) {
			numeroDePrueba = (int) Math.floor(Math.random() * 100);
		}
		
		return numeroDePrueba;
	}
	
	
	public static void partidaBingo(Boleto[] boletos) {
		
		boolean[] todosLosNumeros = new boolean[100];
		boolean linea = false;
		boolean bingo = false;
		while (!bingo) {
			//Crea un número aleatorio y comprueba si está repetido, si es así genera otro
			//Posteriormente marca este número como verdadero
			int numeroDeMomento;
			
			do {
				numeroDeMomento = numAleatorio();
			} while (todosLosNumeros[numeroDeMomento]);
			
			todosLosNumeros[numeroDeMomento] = true;
			
			for (int i = 0; i < boletos.length; i++) {
				boletos[i].marcarNumero(numeroDeMomento);
			}
			
			if (!linea) {
				for (int i = 0; i < boletos.length; i++) {
					if (boletos[i].comprobarLinea()) {
						linea = true;
						System.out.println();
						System.out.println("Línea del jugador " + (i+1));
						boletos[i].mostrarBoleto();
					}
				}
			}
			
			for (int i = 0; i < boletos.length; i++) {
				if (boletos[i].comprobarBingo()) {
					bingo = true;
					System.out.println();
					System.out.println("Bingo del jugador " + (i+1));
					boletos[i].mostrarBoleto();
				}
			}
			
		}
	}

	
}
