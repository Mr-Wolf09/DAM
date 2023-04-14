package ManejoArchivos;
import java.io.*;

public class LeerArchivoPares {
		
			public static void main(String args[]) {
				
				try {
					BufferedReader escribir = new BufferedReader(new FileReader("d:\\prueba\\pares.txt"));
					String linea;
					while ((linea= escribir.readLine()) != null) {
						System.out.println(linea);
					}
				}catch(IOException eZ) {
						System.out.println("Error al leer fichero Pares");
					}
				}
			}


