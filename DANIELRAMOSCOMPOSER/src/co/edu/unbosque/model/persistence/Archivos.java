package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos {
	
	public int escribirArchivo(String url, String cancion) {
		File f = new File(url);
		
		try {
			FileWriter fw = new FileWriter(f); 
			PrintWriter pw = new PrintWriter(fw); 
			
			pw.println(cancion); 
			
			fw.close();
		}catch(IOException e) {
			return -1;
		}
		
		return 0;
	}
}
