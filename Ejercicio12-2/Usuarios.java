package CrearCarpeta;
import java.io.*;
import java.util.*;

public class Usuarios {
	public static void main(String args[]) {
				
		Scanner Z = new Scanner(System.in);
	
		String ruta= "e:/prueba/";
		String carpeta ="Clientes";
		String archive ="usuarios.txt";
		
				System.out.print("Escriba su Usuario: ");
				String usuario= Z.nextLine();
				System.out.print("Escriba su Password: ");
				String password = Z.nextLine();
				
				String option = usuario + "\n"+ password;
				
				 File carpetaa = new File(ruta + carpeta);
				 if (!carpetaa.exists()) {
				    
				       	carpetaa.mkdirs(); 
				    	        
	
				        	try {
		BufferedWriter read = new BufferedWriter(new FileWriter(carpetaa +"/"+ archive));
		read.write(option);
		System.out.println("Se ha creado todo correcto");
		read.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}		
	}
	}
}

