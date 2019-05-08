package escribirArchivos;
import java.io.*;
public class Textos {
//prueba nueva Juan
	public void escribir(String nombreArchivo) {
		File f; //Crea un objeto de tipo archivo
		f = new File(nombreArchivo);// Asigna un nombre al archivo
		
		
		//Escritura
		try {
			//Creamos un objeto del tipo File Writer. Es un objeto que escribe en archivos
			//FileWriter w = new FileWriter(f);
			
			//al agregar el parametro true escribe a continuacion, no sobreescribe
			FileWriter w = new FileWriter(f, true);
			//FileWriter w = new FileWriter(f.getAbsoluteFile(), true);
			
			//Espacio en memoria que contiene lo que vamos a escribir en el archivo. Hace ref. al objeto FileWriter que vamos a agregar
			BufferedWriter bw = new BufferedWriter (w);
			//Escribe en el archivo lo almacenado en el buffer.
			PrintWriter wr = new PrintWriter (bw);
			
			// métodos para ecribir
			wr.write("Esto es una línea de texto");
			wr.append ("\n -esta es una segunda linea de texto texto\n");
			//Es necesario cerrarlos. Ahi se guarda la info.
			wr.close();
			bw.close();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		};
	}
	
	
	//Si quisieramos agregar texto a continuacion primero debemos leer el archivo
	public void leer (String nombreArchivo) {
		
		try {
			FileReader r = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(r);
			
			String temp="";
			
			while(temp!=null) {
				
				temp = buffer.readLine();
				if(temp==null)
					break;
				System.out.println(temp);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
