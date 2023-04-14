package ManejoArchivos;
import java.io.*;

public class EjemploFichero02 {
			
					public static void main(String args []) {
						try {
							BufferedWriter escribir = new BufferedWriter(new FileWriter("d:\\prueba\\fruta.txt", true));
							// agnade de nuevo el fichero + datos que se escriba en ese fichero
							//de nuevo
							
							escribir.write("  \n");
							escribir.write("Mandarina \n");
							escribir.write("Mango  \n");
							escribir.write("Sandia \n");
							escribir.write("Platano \n");
							escribir.write("Chirimoya \n");
							escribir.write("Limon \n");
							
							System.out.println("Fichero creado");
							escribir.close();
						}catch(IOException eZ) {
						}
					}
}
