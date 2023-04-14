package ManejoArchivos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CrearFicheroAsignatura {
		public static void main(String args[]) {
			
			try {
				
				BufferedWriter escribir = new BufferedWriter(new FileWriter("c:\\prueba\\asignatura1.txt"));
				escribir.write("Programacion \n");
				escribir.write("Entorno Desarrollo \n");
				escribir.write("Base de Datos \n");
				escribir.write("Fol \n");
				escribir.write("Sistemas \n");
				escribir.write("Lenguaje de Marcas \n");
				
				System.out.println("Fichero Creado");
			  escribir.close();
				
			} catch(IOException ez) {
				System.out.println("No se ha podidio escribir en el archivo");

		}
			}
		}
