package juego;
//clase Juego Tendr� un �nico m�todo constructor que se ocupar� del flujo del juego.
public class Juego {
	
	public Juego(){
	Tablero t = new Tablero();

		//. Llamar� al m�todo imprimeTablero() de la clase Tablero  A partir de entonces entrar� un bucle hasta que alg�n jugador gane o se quede en tablas
	
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

