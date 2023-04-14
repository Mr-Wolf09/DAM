package ManejoArchivos;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fichero2 {

	public static void main(String args[]) {
		
	try {
		
			BufferedReader read = new BufferedReader(new FileReader("d:\\prueba\\fruta.txt"));
			String linea = "";
			while (linea != null) {
				System.out.println(linea);
				linea = read.readLine();
			}
			read.close();
			
		} catch(FileNotFoundException ez) {
			System.out.println("No se encuentra el fichero malaga.txt");
		}catch(IOException ez) {
			System.out.println("No se puede leer el archivo malaga.txt");
	}
	}
}
