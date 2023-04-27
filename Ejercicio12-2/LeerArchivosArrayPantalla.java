package ManejoArchivos;
import java.io.*;

public class LeerArchivosArrayPantalla {
		public static void main(String args[]) {
	
		
			//int i;
			File carpeta = new File("d:\\prueba");
			String [] listado = carpeta.list();
			
			System.out.println("Contenido de la carpeta:");
		for(String archive: listado) {
				System.out.println(archive); 
			
			
			
			/*	if (listado == null || listado.length == 0) {
					System.out.println("Los archivos no se encuentran");
					return;
				}else {
				for (i=0; i < listado.length; i++) {
					System.out.println(listado[i]);
				}
				
       }*/
		}
}
}
