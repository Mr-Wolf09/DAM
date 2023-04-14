package ManejoArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CrearFicheros {
		
					public static void main (String args[]) {
						
						try {
							BufferedWriter escribir = new BufferedWriter(new FileWriter("d:\\prueba\\clientes.txt"));
							escribir.write("Albert \n");
							escribir.write("Ana \n");
							escribir.write("Fernando \n");
							escribir.write("Paca \n");
							escribir.write("Eva \n");
							escribir.write("Laura \n");
							
							System.out.println("Fichero Creado");
						  escribir.close();
							
						} catch(IOException ez) {
							System.out.println("No se ha podidio escribir en el archivo");
			
					}
			   }
				
	}
