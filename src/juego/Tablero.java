package juego;

import java.util.Scanner;


public class Tablero {
	char jugadoractual;
	char [][] arrayTablero;
	 int filas = 3;
	 int columnas = 3;
	private boolean turno;
	private final char VACIO = '-';
	
	 

	
	//Constructor 
	 public Tablero(){
		 arrayTablero = new char[filas][columnas];
		 for (int i = 0; i < arrayTablero.length; i++) {
			 for (int j = 0; j < arrayTablero[i].length; j++) {
				 arrayTablero [i] [j]='-';
			 }	 
		 }
		 jugadoractual='x';
	 }
	//metodo imprimeTablero Imprime el tablero de el tres en rayas con cada casilla
	public void imprimeTablero(){
		System.out.println("---1---2---3--");
		System.out.println("1| "+arrayTablero[0][0]+" | "+arrayTablero[0][1]+ " | "+arrayTablero[0][2]+" |");
		System.out.println("-------------");
		System.out.println("2| "+arrayTablero[1][0]+" | "+arrayTablero[1][1]+ " | "+arrayTablero[1][2]+" |");
		System.out.println("-------------");
		System.out.println("3| "+arrayTablero[2][0]+" | "+arrayTablero[2][1]+ " | "+arrayTablero[2][2]+" |");
		System.out.println("-------------");
	}
	
	/**
	Metodo actualizaTablero Actualiza el tablero cada vez que introducimos una ficha y una columna y si esta ocupada te dice que esta ya ocupada 
	 y si pones un numero alto de columna y de fila te va a dar error por que no hay tantas columnas ni filas en el tablero
	*/
	public void actualizaTablero(){
		boolean casillaCorrecta= false;
		while(casillaCorrecta==false){
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca una fila");
		int fila = sc.nextInt();
		System.out.println("Introduzca una columna");
		int columna= sc.nextInt();
		if(fila<1|fila>3){
		System.out.println("El numero de fila introduccida no es correcta");
			continue;
		}
		if(columna<1|columna>3){
			System.out.println("El numero de columna introducido no es correcto");
			continue;
		}
		if(arrayTablero[fila-1][columna-1]!='-') {
			System.out.println("Esa casilla esta ocupada");
			continue;
		}
		arrayTablero[fila-1][columna-1]=jugadoractual;
		casillaCorrecta=true;
		} 
		
	}
	
	// metodo chequeaGanador mira el tablero para ver si hay algun ganador con las fichas que tenemos puestas en el tablero
	public boolean chequeaGanador(){
		
		if((chequeaFilas()==true) || (chequeaColumnas()==true ||(chequeaDiagonales()==true) )) {
			System.out.println("Hay ganador");
			return true;
			
		}
		return false;
				
	}
		
	//metodo chequeaFilas chequea las filas para ver si estan las filas ocupadas en esa casilla o si hay un ganador
	public boolean chequeaFilas() {
		if((arrayTablero[0][0] == jugadoractual) && (arrayTablero[0][1]== jugadoractual)&& (arrayTablero[0][2]== jugadoractual)){
			
			return true;
			
	}
	else if((arrayTablero[1][0] == jugadoractual) && (arrayTablero[1][1]== jugadoractual)&& (arrayTablero[1][2]== jugadoractual)){		
		
		return true;
	}
	else if((arrayTablero[2][0] == jugadoractual) && (arrayTablero[2][1]== jugadoractual)&& (arrayTablero[2][2]== jugadoractual)){
		return true;
	}else {
		
		return false;
	}
	}
	//metodo chequeaColumnas chequea las columnas para ver si estan las filas ocupadas en esa casilla o si hay un ganador
	
	public boolean chequeaColumnas() {
	
		if((arrayTablero[0][0] == jugadoractual) && (arrayTablero[1][0]== jugadoractual)&& (arrayTablero[2][0]== jugadoractual)){		
			
			return true;
		}
		else if((arrayTablero[0][1] == jugadoractual) && (arrayTablero[1][1]== jugadoractual)&& (arrayTablero[2][1]== jugadoractual)){
			return true;
		}else if  ((arrayTablero[0][2] == jugadoractual) && (arrayTablero[1][2]== jugadoractual)&& (arrayTablero[2][2]== jugadoractual)){
			return true;
		}
		else {return false;
		}
		}
	
	

	//metodo chequeaDiagonales chequea las diagonales para ver si estan las filas ocupadas en esa casilla o si hay un ganador
	private boolean chequeaDiagonales() {
		if((arrayTablero[0][0] == jugadoractual) && (arrayTablero[1][1]== jugadoractual)&&(arrayTablero[2][2]== jugadoractual)) {
		
			return true; 
		} 
		
		else if((arrayTablero[0][2] == jugadoractual) && (arrayTablero[1][1] == jugadoractual)&&(arrayTablero[2][0]== jugadoractual)) {
			
			return true;
		}else {
			return false;
		} 
		
	}
	// metodo tablero lleno lo que hace es recorrerse todas las casillas para comprobar si están todas vacías, devolverá false si encuentra alguna vacía.
	public boolean TableroLleno() {
		    for (int i = 0; i < arrayTablero.length; i++) {
		        for (int j = 0; j < arrayTablero[0].length; j++) {
		            if (arrayTablero[i][j] == VACIO) {
		            	return false;
		            }
		        }
		    }
			return true;
		 }
	//metodo CambiaJugador que chequeará cual es el jugador actual y cambiará al opuesto.
	public void CambiaJugador() {
		
	      if(jugadoractual=='x') {
	    	  jugadoractual ='o';
	      }else {
	    	  jugadoractual='x'; 
	      }
	}
	   
	 
	 
	/**
	 * Cambia el turno
	 */
	public void cambiaTurno() {
	    this.turno = !this.turno;
	}
	
}