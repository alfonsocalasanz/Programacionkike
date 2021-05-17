
public class NotificacionMail implements INotificacion {
	
	private String nombreCliente;
	private String contacto;
	private String texto;

	public void envio () {
		System.out.println("Enviando mail a: "+this.contacto +" con texto: " + this.texto);
	}

	public NotificacionMail(String nombreCliente, String contacto, String texto) {
		super();
		this.nombreCliente = nombreCliente;
		this.contacto = contacto;
		this.texto = texto;
	}
	
}
