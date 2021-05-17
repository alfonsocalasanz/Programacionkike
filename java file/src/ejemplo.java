import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ejemplo {
	public static void main(String[] args) throws IOException {
		
	
File miArchivo = new File ("C:\\Users\\201906\\Desktop\\pepe\\juan.txt");
File miDirectorio = new File ("C:\\Users\\201906\\Documents\\Programacion");
	miDirectorio.mkdir();
	miArchivo.createNewFile();
	
	System.out.println(miArchivo.exists());
	System.out.println(miDirectorio.exists());
	System.out.println(miArchivo.isFile());
	System.out.println(miDirectorio.isDirectory());
	System.out.println(miDirectorio.lastModified());
	
	long longtime = miDirectorio.lastModified();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy HH:mm:ss:SSS Z");
	Date date = new Date(longtime);
	
	System.out.println(dateFormat.format(date));
	}
}