package juego;
//clase Juego Tendrá un único método constructor que se ocupará del flujo del juego.
public class Juego {
	
	public Juego(){
	Tablero t = new Tablero();

		//. Llamará al método imprimeTablero() de la clase Tablero  A partir de entonces entrará un bucle hasta que algún jugador gane o se quede en tablas
	
	do {
		t.imprimeTablero();
		t.actualizaTablero();
		
		if(t.chequeaGanador()==true) {
			t.imprimeTablero();
			System.out.println("hay un ganador");
			break;
		}else if(t.TableroLleno()== true) {
			t.imprimeTablero();
			System.out.println("se acabo la partida, empate");
			break;
		}
			
		
		t.CambiaJugador();
	
	}while(true);
	
	}
}

