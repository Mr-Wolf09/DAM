package ManejoArchivos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// 		EJERCIO 7

public class CrearVariosFicheros {
  
	 public static void main(String args[]) {
		 try {
			BufferedReader fichero1 = new BufferedReader(new FileReader("e:\\prueba\\fichero01.txt")); 
			BufferedReader fichero2 = new BufferedReader(new FileReader("e:\\prueba\\fichero02.txt"));
			BufferedWriter fichero = new BufferedWriter(new FileWriter("e:\\prueba\\mezcla.txt"));
			// IMPORTANTE CAMBIAR LA RUTA DEL ARCHIVO DONDE SE CREA O DONDE VAYA LEER
			//SINO CREAR UN ERROR Y NO SE EJECUTA.LOS NOMBRES DEL ARCHIVO ESTAN CORRECTO
			//FUNCIONA
			String linea1 = "";
			String linea2 = "";
			
			while((linea1 != null) || (linea2 != null)) {
				linea1 = fichero1.readLine();
				linea2 = fichero2.readLine();
				
				if(linea1 != null) {
					fichero.write(linea1 + "\n");
				}
				if(linea2 != null) {
					fichero.write(linea2 + "\n");
				}
			}
			fichero1.close();
			fichero2.close();
			fichero.close();//CERRAMOS PARA QUE NO SE QUEDE ABIERTO
			System.out.println("Archivo Mezcla creado perfectamente");
				
		 }catch(IOException eZ) {//LA EXCEPCION DE ERROR EN CASO DE QUE NO SE EJECUTE CON UA
				//REPUESTA EN PANTALLA 
			 System.out.println("Se ha producido un error lectura/escritura");
			 System.err.println(eZ.getMessage());
		 }
	 }
}
