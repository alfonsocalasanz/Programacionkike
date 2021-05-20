package com.catastro.principal;

import java.util.Comparator;

import com.catastro.dto.Finca;
import com.catastro.dto.Propietario;

public class ComparaFinca implements Comparator<Finca>{


	public int compare(Finca o1, Finca o2) {
		// TODO Auto-generated method stub
		return o1.getLocalizacion().compareTo(o2.getLocalizacion());
	}

	

}
