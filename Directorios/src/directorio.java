import java.io.File;

public class directorio {
public static void main(String[] args) {
File miDirectorio = new File ("C:\\Users\\201906\\Documents\\Programacion");

String[] listadoDirectorio = miDirectorio.list();

for (String elemento: listadoDirectorio) {
	System.out.println(elemento);
}
	File[] listadoFicheros = miDirectorio.listFiles();
	
	for(File elemento : listadoFicheros) {
		System.out.println(elemento.getName());
	}
}
}
