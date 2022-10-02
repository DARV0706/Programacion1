package co.edu.unbosque.controller;

import co.edu.unbosque.model.Canciones;
import co.edu.unbosque.view.View;

public class Controller {
	private View gui;
	private Canciones can;
	
	public Controller() {
		gui = new View();
		can = new Canciones();
		funcionar();
	}
	
	public void funcionar() {
		
		hacerEstrofas();
		escribirCancionEnArchivo();
	}
	
	public void hacerEstrofas() {
		gui.mostrarMensaje(can.getE1().generarFrasesCancion()+"\n"+
				   can.getE2().generarFrasesCancion()+"\n"+
				   can.getE3().generarFrasesCancion()+"\n");
	}
	
	public void escribirCancionEnArchivo() {
		try {
			can.getA().escribirArchivo(gui.generarArchivo(), can.getE1().toString()+ "\n" + can.getE2().toString()+ "\n" + can.getE3().toString());
		} catch (NullPointerException e) {
			gui.mostrarMensaje("Se cancelo la operacion, ¡DEBE GUARDAR EL ARCHIVO!");
		}
	}
	
	public void tramitarProperties() {
		can.getP().escribirPropiedades();
	}
}
