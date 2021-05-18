package com.catastro.dto;

import java.util.ArrayList;
import java.util.List;

public class Propietario implements Comparable<Propietario> {
	
	private String nombre;
	private Integer edad;
	private String ciudad;
	private List<Finca> listaFincas;
	private Integer superficietotal = 0;
	
	public Integer getSuperficietotal() {
		return superficietotal;
	}
	public void setSuperficietotal(Integer superficietotal) {
		this.superficietotal = superficietotal;
	}
	public Propietario(String nombre, Integer edad, String ciudad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		listaFincas = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public List<Finca> getListaFincas() {
		return listaFincas;
	}
	public void setListaFincas(List<Finca> listaFincas) {
		this.listaFincas = listaFincas;
	}
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", edad=" + edad + ", ciudad=" + ciudad + ", listaFincas="
				+ listaFincas + "]";
	}
	@Override
	public int compareTo(Propietario o) {
		// Un número negativo significa que el propietario que se le pasa por parámetro es mayor que el propietario que corre el método	
		// Un número positivo significa que el propietario que se le pasa por parámetro es menor que el propietario que corre el método
		// si devuelve cero significa que son iguales
		
		if (this.listaFincas.size() > o.listaFincas.size()) {
			return -1;
		} else if (this.listaFincas.size() < o.listaFincas.size()) {
			return 1;
		}
		return 0;
	}
	
	

}
