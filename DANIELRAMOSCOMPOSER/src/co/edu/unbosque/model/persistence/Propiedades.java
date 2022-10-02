package co.edu.unbosque.model.persistence;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	
	private int f,e;
	private Properties prop;
	private String archivoprop;
	
	public Propiedades() {
		 prop = new Properties();
		 archivoprop = "c:\\data\\archivo.properties";
	}
	
	public int getE() {
		return e;
	}


	public void setE(int e) {
		this.e = e;
	}


	public int getF() {
		return f;
	}


	public void setF(int f) {
		this.f = f;
	}
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("nombreProyecto", "DANIELRAMOSCOMPOSER");
			prop.setProperty("nombreArchivo", "archivo.properties");
			prop.setProperty("nombreCodigoFuente", "Propiedades.java");
			prop.setProperty("Frases por estrofa", "4");
			f = Integer.parseInt(prop.getProperty("Frases por estrofa: "));
			prop.setProperty("Estrofas por cancion", "3");
			e = Integer.parseInt(prop.getProperty("Estrofas por cancion: "));
			prop.store(new FileOutputStream(archivoprop), null);
		} catch(IOException e) {
			return -1;
		}
		return 0;
	}	
}

