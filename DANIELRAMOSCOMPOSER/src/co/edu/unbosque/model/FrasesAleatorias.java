package co.edu.unbosque.model;

import java.util.Random;

public class FrasesAleatorias {
	
	private String[][] matriz; 
	private String estrofa = "";
	
	public FrasesAleatorias() {
		matriz = new String [4][6];
	}
	
	public String generarFrasesCancion() {
		Random r = new Random();
		
		matriz[0][0] = "Mami";
		matriz[1][0] = "Bebé";
		matriz[2][0] = "Plincess";
		matriz[3][0] = "Mami";
		
		matriz[0][1] = "yo quielo";
		matriz[1][1] = "yo puedo";
		matriz[2][1] = "yo vengo a";
		matriz[3][1] = "voy a";
		
		matriz[0][2] = "encendelte";
		matriz[1][2] = "amalte";
		matriz[2][2] = "ligal";
		matriz[3][2] = "jugal";
		
		matriz[0][3] = "suave";
		matriz[1][3] = "lento";
		matriz[2][3] = "rapido";
		matriz[3][3] = "fuelte";
		
		matriz[0][4] = "hasta que salga el sol";
		matriz[1][4] = "toda la noche";
		matriz[2][4] = "hasta el amanecel";
		matriz[3][4] = "todo el dia";
		
		matriz[0][5] = "sin anestecia";
		matriz[1][5] = "sin complomiso";
		matriz[2][5] = "feis to feis";
		matriz[3][5] = "sin miedo";
		
		
		for (int i=0; i<1; i++) {
			for (int j=0; j<4; j++) {
				estrofa += matriz[r.nextInt(4)][0]+ " " +
						   matriz[r.nextInt(4)][1]+ " " +
						   matriz[r.nextInt(4)][2]+ " " +
						   matriz[r.nextInt(4)][3]+ " " +
						   matriz[r.nextInt(4)][4]+ " " +
						   matriz[r.nextInt(4)][5]+ "\n";
			}
		}
		return estrofa;
	}

	@Override
	public String toString() {
		return estrofa;
	}
}
