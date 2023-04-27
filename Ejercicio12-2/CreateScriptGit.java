import java.io.*;

public class CreateScriptGit  {
  public static void main(String args[]) {
	
	  try {
		  FileWriter GIT = new FileWriter("d:/prueba/gits.sh");
		  BufferedWriter git = new BufferedWriter(GIT);
					  git.write("git checkout -b Mr-Wolf09\n");
					  git.write("git add git.sh\n");
					  git.write("git commit -m 'Actualizar Cobarde'\n");
					  git.write("git push origin Mr-Wolf09\n");
					  System.out.println("script creado\n");
					  git.close();
					  
				  }catch (Exception eZ) {
					eZ.printStackTrace();
	}
  }
  }
