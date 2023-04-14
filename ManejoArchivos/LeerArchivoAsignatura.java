package ManejoArchivos;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoAsignatura {
		public static void main(String args[]) {
			String Asignatura = "d:\\prueba\\asignatura.txt";
			
			try {
				BufferedReader read = new BufferedReader(new FileReader(Asignatura));
				String linea = "";
				while ( linea != null) {
					System.out.println(linea);
					linea= read.readLine();
				}
				read.close();
		} catch (FileNotFoundException ez) {
			System.out.println("No se encuantra el fichero" + Asignatura);
		}catch(IOException ez) {
			System.out.println("No se puede leer archivo " + Asignatura);
		}
			
		}
}
