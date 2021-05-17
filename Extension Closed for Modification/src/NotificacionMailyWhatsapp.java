
public class NotificacionMailyWhatsapp {
	
	private String nombreCliente;
	private String contacto;
	private String texto;
	private String tipoEnvio;
	
	
	public NotificacionMailyWhatsapp(String nombreCliente, String contacto, String texto) {
		super();
		this.nombreCliente = nombreCliente;
		this.contacto = contacto;
		this.texto = texto;
	}


	public void envioPorMail() {
		System.out.println("Enviando mail a: "+this.contacto +" con texto: " + this.texto); 
		
	}
	
	public void envioPorWhatsapp() {
		System.out.println("Enviando Whatsapp a: "+this.contacto +" con texto: " + this.texto); 
	
}


	public NotificacionMailyWhatsapp(String nombreCliente, String contacto, String texto, String tipoEnvio) {
		super();
		this.nombreCliente = nombreCliente;
		this.contacto = contacto;
		this.texto = texto;
		this.tipoEnvio = tipoEnvio;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public String getContacto() {
		return contacto;
	}


	public void setContacto(String contacto) {
		this.contacto = contacto;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public String getTipoEnvio() {
		return tipoEnvio;
	}


	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	
}
