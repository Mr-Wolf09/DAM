package ManejoArchivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//		 Ejericio 8

public class LeerVariosArchivos {
			public static void main(String args[]) {
				
				try {
					BufferedReader fichero1 = new BufferedReader(new FileReader("c:\\prueba\\fichero01.txt"));
					BufferedReader fichero2 = new BufferedReader(new FileReader("c:\\prueba\\fichero02.txt"));
					BufferedReader fichero  = new BufferedReader(new	FileReader("c:\\prueba\\mezcla.txt"));
					
					String linea = "";
					
					System.out.print("Contenido del fichero fichero1.txt: ");
						while ((linea = fichero1.readLine()) != null) {
								System.out.println(linea);
					}

					System.out.print("Contenido del fichero fichero2.txt: ");
						while ((linea = fichero2.readLine()) != null) {
								System.out.println(linea);
					}
					System.out.println("Contenido del fichero mezcla.txt:");
						while ((linea = fichero.readLine()) != null) {
								System.out.println(linea);
					}
						
					fichero1.close(); fichero2.close(); fichero.close();
					
					} catch (IOException eZ) {
							System.out.println("Se ha producido un error de lectura");
										System.err.println(eZ.getMessage());
						}
					}
			}