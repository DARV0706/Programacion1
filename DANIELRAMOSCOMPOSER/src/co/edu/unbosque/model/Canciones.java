package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Archivos;
import co.edu.unbosque.model.persistence.Propiedades;

public class Canciones {
	
	private Archivos a;
	private Propiedades p;
	private FrasesAleatorias e1, e2, e3;
	
	public Canciones() {
		a = new Archivos();
		p = new Propiedades();
		e1 = new FrasesAleatorias();
		e2 = new FrasesAleatorias();
		e3 = new FrasesAleatorias();
	}
	
	public void crearCancion() {
		e1.toString();
		e2.toString();
		e3.toString();
		}

	public Archivos getA() {
		return a;
	}

	public void setA(Archivos a) {
		this.a = a;
	}

	public Propiedades getP() {
		return p;
	}

	public void setP(Propiedades p) {
		this.p = p;
	}

	public FrasesAleatorias getE1() {
		return e1;
	}

	public void setE1(FrasesAleatorias e1) {
		this.e1 = e1;
	}

	public FrasesAleatorias getE2() {
		return e2;
	}

	public void setE2(FrasesAleatorias e2) {
		this.e2 = e2;
	}

	public FrasesAleatorias getE3() {
		return e3;
	}

	public void setE3(FrasesAleatorias e3) {
		this.e3 = e3;
	}
}
