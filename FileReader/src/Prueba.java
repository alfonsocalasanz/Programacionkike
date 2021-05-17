import java.io.BufferedReader;
import java.io.FileReader;
/**
public class Prueba{
	public void lector() throws Exception {
		try(FileReader filereader = new FileReader("C:\\Users\\201906\\Desktop\\pepe\\juan.txt")){
				BufferedReader buffer = new BufferedReader(filereader);
			String linea;
			while((linea=buffer.readLine())!=null) {
				System.out.println(linea);
				
			}
		}
	}
}
**/

try (FileWriter mi