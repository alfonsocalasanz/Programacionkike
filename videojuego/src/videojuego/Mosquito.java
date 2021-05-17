package videojuego;

public class Mosquito implements IMolestable{
	private Integer id;
	//Composicion
	IMolestable molestia;
	
	//constructor
	public Mosquito(Integer id, IMolestable molestia) {
		super();
		this.id = id;
		this.molestia = molestia;
	}

	@Override
	public void molestar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
