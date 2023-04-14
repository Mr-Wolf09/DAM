package ManejoArchivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//			EJERCICIO 10
public class LeerArchivoArray {
				public static void main(String args[]) {
								
					try {
						// IMPORTANTE CAMBIAR LA RUTA DEL ARCHIVO DONDE SE CREA O DONDE VAYA LEER
						//SINO CREAR UN ERROR Y NO SE EJECUTA.LOS NOMBRES DEL ARCHIVO ESTAN CORRECTO
						//FUNCIONA
						BufferedReader read = new BufferedReader(new FileReader("e:\\prueba\\fichero_escritura.txt"));
						String linea = "";
						while ( linea != null) {
							System.out.println(linea);
							linea= read.readLine();
						}
						read.close();
				} catch (FileNotFoundException eZ) {
					System.out.println("No se encuantra el fichero");
				}catch(IOException eZ) {
					System.out.println("No se puede leer archivo");
				}
					
				}
}
