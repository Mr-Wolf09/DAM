package ManejoArchivos;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LeerArchivo {
				public static void main(String args[]) {
					 
				
					try {
						BufferedReader read = new BufferedReader(new FileReader("d:\\prueba\\clientes.txt"));
						String linea = "";
						while ( linea != null) {
							System.out.println(linea);
							linea= read.readLine();
						}
						read.close();
				} catch (FileNotFoundException ez) {
					System.out.println("No se encuantra el fichero Cliente");
				}catch(IOException ez) {
					System.out.println("No se puede leer archivo Cliente");
				}
					
				}
}
