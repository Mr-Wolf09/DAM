package ManejoArchivos;
import java.io.*;

//   EJERCICIO 9
public class CrearArchivoArray {
			public static void main(String args[]) {
				
			
					String[] lineas = { "One", "Two", "Tres", "Four", "Cinc", "Seis", "Seven", "..." };

					/** FORMA 1 DE ESCRITURA **/
					FileWriter fichero = null;
					try {
						fichero = new FileWriter("d:/prueba/fichero_escritura.txt");
						// IMPORTANTE CAMBIAR LA RUTA DEL ARCHIVO DONDE SE CREA O DONDE VAYA LEER
						//SINO CREAR UN ERROR Y NO SE EJECUTA.LOS NOMBRES DEL ARCHIVO ESTAN CORRECTO
						//FUNCIONA
						
						// Escribimos linea a linea en el fichero
						for (String linea : lineas) {
							fichero.write(linea + "\n");
						}
						fichero.close();//CERRAMOS PARA QUE NO SE QUEDE ABIERTO
					} catch (Exception eZ) {//LA EXCEPCION DE ERROR EN CASO DE QUE NO SE EJECUTE CON UA
						//REPUESTA EN PANTALLA 
						System.out.println("Mensaje de la excepción: " + eZ.getMessage());
					}
				}//Hasta Luegui
			}
