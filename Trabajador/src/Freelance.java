
public class Freelance extends Trabajador{
	
	private double HorasTrabajadas;
	private double tarifa;
	public Freelance(String nombre, int id) {
		super(nombre, id);
		// TODO Auto-generated constructor stub
	}
	public double calculoSalario() {
		return this.HorasTrabajadas * this.tarifa;
	}
	

		
	
}
