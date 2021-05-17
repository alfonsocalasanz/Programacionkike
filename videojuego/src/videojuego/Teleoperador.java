package videojuego;

public class Teleoperador implements IMolestable {
	String nombre;
	//Composicion
	IMolestable molestia;
	//Constructor,getters,setters
	public Teleoperador(String nombre, IMolestable molestia) {
		super();
		this.nombre = nombre;
		this.molestia = molestia;
	}
	@Override
	public void molestar() {
		// TODO Auto-generated method stub
		
	}
	
}
