package ManejoArchivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FicheroPares {
	public static void main(String args[]) {
		
			
						try {
							BufferedWriter escribir= new BufferedWriter(new FileWriter("d:\\prueba\\pares.txt"));
							
							int count = 0;
							for (int  i=2; i <=100; i +=2) {
								escribir.write(Integer.toString(i)+ "\n");
								count++;
							}
							
							System.out.println("Se ha creado el fichero Pares");
							System.out.println("Se ha guardado " + count + " numeros pares");
							escribir.close();
						}catch (IOException eZ) {
							System.out.println("No se ha podido escribir el fichero");
							
						}
	}
}
	
