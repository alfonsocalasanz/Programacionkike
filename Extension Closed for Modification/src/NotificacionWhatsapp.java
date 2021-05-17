
public class NotificacionWhatsapp implements INotificacion {
	
	private String nombreCliente;
	private String contacto;
	private String texto;
	
	public void envio () {
		System.out.println("Enviando Whatsapp a: "+this.contacto +" con texto: " + this.texto);
	}

	public NotificacionWhatsapp(String nombreCliente, String contacto, String texto) {
		super();
		this.nombreCliente = nombreCliente;
		this.contacto = contacto;
		this.texto = texto;
	}
	
	
}

