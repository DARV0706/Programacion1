package co.edu.unbosque.model;

public class ClaseAltaFacha {

	private ClaseY y;
	
	public ClaseAltaFacha() {
		// TODO Auto-generated constructor stub
		y = new ClaseY();
	}
	
	public String mostrarMensajeProcesar(String dato) {
		return dato+ "procesado por la clase Alta Facha";
	}

	public ClaseY getY() {
		return y;
	}

	public void setY(ClaseY y) {
		this.y = y;
	}

}