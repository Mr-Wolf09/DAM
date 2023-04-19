package CrearCarpeta;
import java.io.*;

public class DeleteArchivo {
		public static void main(String arg[]) {
		//creamos la ruta y
				String ruta = "d:\\prueba\\Ejercicio1\\";
				String archivo= "borrar.txt";
				File fichero = new File(ruta + archivo);
				//preguntamos si el fichero
				if(fichero.exists()== true) {
				
					fichero.delete();
					System.out.println("Borrado");
				}else {
					System.out.println("El fichero no existe");
				}
		}
	}
