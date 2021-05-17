package videojuego;

public class Molestia {
	//Metodo que se aprovechara del polimorfismo y seguira funcionando 
	//sin necesidad de modificar aunque se a�adan enemigos
	public void ataques(IMolestable[] eneIMolestables) {
		
		for (IMolestable m : eneIMolestables) {
			m.molestar();
		}
	}
}
