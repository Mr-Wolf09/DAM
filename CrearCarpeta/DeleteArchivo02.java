package CrearCarpeta;
import java.io.*;

public class DeleteArchivo02 {
	public static void main(String arg[]) throws IOException {
	//PARA CREAR UNA EXCEPCION Y QUE SE EJECUTE.EN LUGAR DE HACER UN
		//TRY CATCH
		
	//creamos la ruta 
			String ruta = "d:\\prueba\\Ejercicio1\\";
			String archivo= "borrar.txt";
			File fichero = new File(ruta + archivo);
			//preguntamos si el fichero
			if(fichero.exists()== true) {
			
				fichero.delete();
				System.out.println("Borrado");
			}else {
				//CREAMOS LA CARPETA UNA VEZ QUE NO HAY NADA
				//CON SU CONTEXTO POR DENTRO
				BufferedWriter escribir = new BufferedWriter(new FileWriter("d:\\prueba\\Ejercicio1\\borrar.txt"));
							escribir.write("Hasta Luegui");
							System.out.println("Creado archivo");
							escribir.close();
			}
	}
}

