import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Propietario implements Comparable {
	String nombre;
	Integer edad;
	String localidad;

	
public Propietario(String nombre, Integer edad, String localidad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.localidad = localidad;
}
	List<Propietario> listaPropietarios = new ArrayList<>();
public static void main(String[] args) {
	new Propietario(),dale();
}
	public void dale() {
		getSPropietario();
 	Collections.sort(listaPropietarios); //Error de compilación
		System.out.println(listaPropietarios);
	}

void getSPropietario()  {
		
		File file = new File("C:\\Users\\ALFONSO\\Downloads\\listaPropietarios.txt");
		BufferedReader lector;
		try {
			lector = new BufferedReader(new FileReader(file));
			String linea;
			while ((linea = lector.readLine()) != null) {
				
				anadePropietario(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
void anadePropietario(String linea){
	
	String[] arrayDePropietario = linea.split(";");
	Propietario p = new Propietario(arrayDePropietario[0], arrayDePropietario[1],arrayDePropietario[2]);
	listaPropietarios.add(p);
}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}