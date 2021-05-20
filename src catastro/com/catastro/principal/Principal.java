package com.catastro.principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.catastro.dto.Finca;
import com.catastro.dto.Propietario;
import com.spotify.tipos.Cancion;
import com.spotify.tipos.ComparaArtista;
import com.spotify.tipos.ComparaTitulo;

public class Principal{

	List<Propietario> listaPropietarios = new ArrayList<>();

	public static void main(String[] args) {
		Principal p = new Principal();
		// 2.1-Leer fichero propietarios, ir creando objetos propietario e irlos
		// metiendo en una lista de propietarios.

		p.leePropietarios();

		// 2.2-leer finca, en cada linea creo un objeto finca. Me quedo con el
		// propietario en una variable temporal y voy buscando a que usuario pertenece
		// (bucle for) y cuando lo encuentre lo añado a la lista.
		p.asignaFincas();
		// 2.3-Llamar al método static Collections.sort(...)
		Collections.sort(p.listaPropietarios);
		
		System.out.println(p.listaPropietarios);

	}
	public void dale() {
		getSPropietarios();
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Como desea ordenar la lista de Fincas?  (numero de propiedades /edad)" + "\n");
		String ordenacion = sc.next();
		sc.close();
		if (ordenacion.equals("Propietario")) {
			Collections.sort(listaPropietarios, new ComparaPropietario()); 
			
		}else if(ordenacion.equals("Finca")){
			Collections.sort(listaPropietarios, new ComparaFinca()); 
		}
		for ( Propietario p : listaPropietarios) {
			System.out.println(p.toString());
	}
	}
	public void leePropietarios() {

		try {
			BufferedReader superLector = new BufferedReader(new FileReader(new File("C:\\Users\\201906\\Downloads\\listaPropietarios (1).txt")));
			String linea;
			while((linea = superLector.readLine()) != null) {
				anadePropietarios(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
/**
 * Va creando objetos propietario y los va añadiendo la la lista
 * @param linea
 */
	
	
	private void anadePropietarios(String linea) {
		String[] arrayDePropietarios = linea.split(";");
		Propietario p = new Propietario(arrayDePropietarios[0], Integer.parseInt(arrayDePropietarios[1]), arrayDePropietarios[2]);
		listaPropietarios.add(p);
	}
	
	public void asignaFincas() {
		File file = new File ("C:\\Users\\201906\\Downloads\\listaFincas (1).txt");
		BufferedReader lector;
		try {
			lector = new BufferedReader(new FileReader(file));
			String linea;
			while ((linea = lector.readLine()) != null) {
				String[] arrayDeFincas = linea.split(";");
				Finca f = new Finca(arrayDeFincas[0], Integer.parseInt(arrayDeFincas[1]));
				String propietario = arrayDeFincas[2];
				for (int i = 0; i < listaPropietarios.size(); i++) {
					if (listaPropietarios.get(i).getNombre().equals(propietario)) {
						listaPropietarios.get(i).getListaFincas().add(f);
						listaPropietarios.get(i).setSuperficietotal(f.getSuperfice()+listaPropietarios.get(i).getSuperficietotal());
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
