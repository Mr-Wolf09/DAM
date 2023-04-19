package CrearCarpeta;
import java.io.*;
import java.util.*;

public class CrearVariasCarpetas {

 	public static void main(String args[]) {
 					try { 
		 						Scanner Z= new Scanner(System.in);
		 						String ruta = "d:\\prueba\\";
		 					    String opcion;
 					
 					do {
		 						System.out.println("Selecciona un opcion:  "); 					
		 						System.out.println("A - Crear Carpetas");
		 						System.out.println("B - Borrar Carpetas");
		 						System.out.println("C - Listar Carpetas o Archivos");
		 						System.out.println("D - Exit");
		 						//aqui seleccionamos la opcion por el scanner y se asigna
		 						//el tipo de ejecucion  de la que se va realizar 						
		 						opcion=Z.nextLine();
 								
 						switch(opcion) {
 									case "A": 
 										System.out.println("Introduzca el nombre de la carpeta: ");
 										String nameCarpeta = Z.nextLine();
 										//la ruta para donde se crea la carpeta
 										File carpeta= new File(ruta+nameCarpeta);
 												//aqui mira si esta carpeta esta creada
 										    if (!carpeta.exists()) {
 										    	//se crea la carpeta 
 										       	carpeta.mkdirs(); 
 										       	System.out.println("La carpeta "+ nameCarpeta +" se ha creado Correctamente");
 										      
 										    
 										   BufferedWriter escribir = new BufferedWriter(new FileWriter(carpeta + "\\" +nameCarpeta + ".txt"));
 										   escribir.write(nameCarpeta);
 										   
 										   System.out.println("Fichero creado");
 										   escribir.close();						    
 										    										
 										    }
 										   	break;
 										   	
 									case "B":
 										 System.out.println("Introduzca el nombre de la  carpeta que quiere Eliminar: ");
 										 String nombreCarpetaBorrar = Z.nextLine();
 										 File borrarCarpeta= new File(ruta+nombreCarpetaBorrar);
 										 
 										 if(borrarCarpeta.exists()) {//comprobamos si xiste la carpeta
 											 if (borrarCarpeta.isDirectory()) { 
 												 File[] files = borrarCarpeta.listFiles();//borrar archivo
 												 for(File file : files) {//borrar lo que hay dentro de ese archivo
 													 file.delete();
 												 }
 											 }
 											 borrarCarpeta.delete();
 											 
 											 System.out.println("la Carpeta " + nombreCarpetaBorrar + " se ha borrado correctamente");
 											 
 										 }else {
 											 System.out.println("La Carpeta " + nombreCarpetaBorrar + " no existe");
 										 }
 										 break;
 										
 									case "C":
 										File files = new File(ruta);
 										String [] ficheros = files.list();
 										
 										int i=0;
 										for(String nomfile: ficheros){
 											i = i+1;
 											System.out.println(i + " - " + nomfile);
 										}								 
 										  			break;
 										  			
 									case "D": 									
 									System.out.println("Saliendo.....");
 									break;
 									
 									default:
 											System.out.println("Opcion valido");
 										 }
 										break;
 										
 					}while(!opcion.equals("C"));
 					
 					Z.close();
 										 
 						}catch(IOException eZ) {
 							System.out.println("No ha podido escribir en el fichero");
 						}
 					}
 				} 			