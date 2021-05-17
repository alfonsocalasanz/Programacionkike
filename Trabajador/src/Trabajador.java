
public class Trabajador {

	private String nombre;
	private int id;
	private double salario;
	private double impuestos;
	

	public Trabajador(String nombre, int id, double salario, double impuestos) {
		this.nombre = nombre;
		this.id = id;
		this.salario = salario;
		this.impuestos = impuestos;
	
	}


	public Trabajador(String nombre2, int id2) {
		this.nombre=nombre2;
		this.id=id2;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getImpuestos() {
		return impuestos;
	}


	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}
	
	public Double calcularSalario(){
		return this.salario-this.impuestos;
	}
	public void guardar(){
		System.out.println("Gurdando al trabajador "+this.nombre);
	}
	
	public void actualizar(){
		System.out.println("Actualizando al trabajador "+this.nombre);
	}
	public void borrar(){
		System.out.println("Borrando al trabajador "+this.nombre);
	}
	
	public void crear(){
		System.out.println("Creando al trabajador "+this.nombre);
	}
	
	
	
}