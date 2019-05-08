package escribirArchivos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Textos t = new Textos ();
		
		//No se puede escribir en el s directamente, hay que crear una carpeta primero
		t.escribir("c:\\escrito.txt");
		
		//No olvidar darle F5 al proyecto para que me aprezca 
		//el archivo de texto
	}
}
