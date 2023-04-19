package ListarFicheros;
import java.io.*;

public class ListarFicheros {
		public static void main (String args[]) {
					File files = new File("d://prueba");
					String [] ficheros = files.list();
					
					int i=0;
					for(String nomfile: ficheros){
						i = i+1;
						System.out.println(i + " - " + nomfile);
					}
}
}
