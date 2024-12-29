package src;
public class Boleto {

	private int boleto[][];
	private final int filas = 3;
	private final int columnas = 5;

	public Boleto() {
		this.boleto = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				this.boleto[i][j] = Bingo.numAleatorio();
			}
		}
		
	}
	
	public void mostrarBoleto() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (this.boleto[i][j] == -1) {
					System.out.print("XX" + " ");
				}else {
					System.out.printf("%2d ", boleto[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	
	public boolean comprobarLinea() {
		
		int cantidadNum = 0;
		for (int i = 0; i < filas; i++) {
			cantidadNum = 0;
			for (int j = 0; j < columnas; j++) {
				if (this.boleto[i][j] == -1) {
					cantidadNum++;
				}
			}
			if (cantidadNum == columnas) {
				return true;
			} 
		}
		return false;
		
		
	}
	
	public boolean comprobarBingo() {
		
		int cantidadNum = 0;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (this.boleto[i][j] == -1) {
					cantidadNum++;
				}
			}
		}
		
		return (cantidadNum == filas * columnas);
		
		
	}
	
	public void marcarNumero(int numeroSacado){
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (this.boleto[i][j] == numeroSacado) {
					this.boleto[i][j] = -1;
				}
			}
		}
		
	}
	
	//public int getFilas() {
	//	return filas;
	//}

	//public int getColumnas() {
	//	return columnas;
	//}

	// Genera un número aleatorio multiplicado por 100 para que sea utilizable, lo
	// trunca y lo convierte en un String

}