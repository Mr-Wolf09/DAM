package CrearCarpeta;
import java.io.*;

public class CrearCarpeta {
	public static void main(String arg[]) {
	
			String ruta = "d:\\prueba\\";
			String carpeta = "Ejercicio1";
			File fichero = new File(ruta+carpeta);
			
			if(fichero.exists()== true) {
				System.out.println("La carpeta existe pringao");
			}else {
				fichero.mkdir();
				System.out.println("Carpeta creada");
			}
	}
}
