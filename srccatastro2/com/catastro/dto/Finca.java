package com.catastro.dto;

public class Finca {
	
	private String localizacion;
	private Integer superfice;
	
	public Finca(String localizacion, Integer superfice) {
		super();
		this.localizacion = localizacion;
		this.superfice = superfice;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public Integer getSuperfice() {
		return superfice;
	}

	public void setSuperfice(Integer superfice) {
		this.superfice = superfice;
	}

	@Override
	public String toString() {
		return "Finca [localizacion=" + localizacion + ", superfice=" + superfice + "]";
	}
	
	
	
	

}
