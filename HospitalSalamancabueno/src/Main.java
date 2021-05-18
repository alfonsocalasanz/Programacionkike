import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	//Declaro este objeto aquí para que tenga visibilidad por todas los métodos
	
	List<Paciente> listaPacientes = new ArrayList<>();

	public static void main(String[] args) {
		
		new Main().dale();

	}
	public void dale() {
		getSPaciente();
	Collections.sort(listaPacientes); //Error de compilación
		for(Paciente p:listaPacientes) {
			System.out.println(p.getNombre() + " "+ p.getApellido1() + " " + p.getApellido2() + " " + p.getEdad() + " ");
		}
	}
	
void getSPaciente()  {
		
		File file = new File("C:\\Users\\201906\\Downloads\\ListaPacientes.txt");
		BufferedReader lector;
		try {
			lector = new BufferedReader(new FileReader(file));
			String linea;
			while ((linea = lector.readLine()) != null) {
				
				anadePaciente(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	void anadePaciente(String linea){
	
	String[] arrayDePacientes = linea.split(";");
	Paciente p = new Paciente(arrayDePacientes[0], arrayDePacientes[1], arrayDePacientes[2],Integer.parseInt(arrayDePacientes[3]));
	listaPacientes.add(p);
}
}

