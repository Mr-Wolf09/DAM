package CambiarTexto;
import java.io.*;

public class CambiarPalabra {
		public static void main(String args[]) {
				String ruta= "d://prueba//ciudades.txt";  //donde se encuentra la direccion
				String palabraBuscada= "Jerez"; // vamos a cambiar la palabra 
				String newPalabra = "Marbella"; //designamos la nueva palabra
				
				try {
					// lectura del archivo
					File archivo= new File(ruta);
					FileReader fr= new FileReader(archivo);
					BufferedReader br= new BufferedReader(fr);
					
					//creamos un archivo temporal para ejecutar los cambios
					File temporal = new File("temp.txt");
					FileWriter fw = new FileWriter(temporal);
					BufferedWriter Zz = new BufferedWriter(fw);
					
					
					String linea;
					while((linea=br.readLine()) != null) {
						String newLinea = linea.replaceAll(palabraBuscada, newPalabra);
						Zz.write(newLinea + "\n");
					}
					//Cierre de recursos que se han quedado abierto
						fr.close();
						br.close();
						fw.close();
						Zz.close();
						
						//Renombra ese archivo temporal al original
						archivo.delete();
						temporal.renameTo(archivo);
						System.out.println("El texto se ha cambiado Perfectamente");
				}catch (IOException Ex) {
					System.out.println("Error al escribir el archivo: " + Ex.getMessage());
				}
					
		}
}
