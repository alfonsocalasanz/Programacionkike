package videojuego;

public class Main {
	public static void main(String[] args) {
		
		Mosquito mosquito1 = new Mosquito(1,  new MolestiaZumbona());
		Mosquito mosquito2 = new Mosquito(2,  new MolestiaZumbona());
		Teleoperador to1 = new Teleoperador("pepe", new MolestiaTelefonica());
		Teleoperador to2 = new Teleoperador("Gertrudis", new MolestiaTelefonica());
		ComercialONG co1 = new Comercial("juan",new MolestiaTelefonica());
		ComercialONG co2 = new Comercial("luis",new MolestiaTelefonica());
		IMolestable[] arraydeMolestables = { mosquito1, mosquito2, to1, to2,co1,co2};
		
		//Ejecucion del ataque
		
		Molestia m = new Molestia();
		m.ataques(arraydeMolestables);
	}
}
