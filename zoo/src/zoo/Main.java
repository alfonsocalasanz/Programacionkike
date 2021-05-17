package zoo;

public class Main {
	public static void main(String[] args) {
		animal[] animales = new animal[5];
		
		
		animales[0] = new Perro();
		animales[1] = new Gato();
		animales[2] = new leon();
		animales[3] = new Lobo();
		animales[4] = new Mono();
	
	for (int i =0; i< animales.length;i++) {
		animales[i].come();
		animales[i].vagabundea();
	}

}
}