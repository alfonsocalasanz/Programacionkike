
public class NotificacionTelegram implements INotificacion {
	private String nombreCliente;
	private String contacto;
	private String texto;


	public void envio () {
		System.out.println("Enviando Telegram a: "+this.contacto +" con texto: " + this.texto);
	}


	public NotificacionTelegram(String nombreCliente, String contacto, String texto) {
		super();
		this.nombreCliente = nombreCliente;
		this.contacto = contacto;
		this.texto = texto;
	}

	
}
