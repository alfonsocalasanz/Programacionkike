
public class NotificacionService {

	public void envioNotificaciones (NotificacionMailyWhatsapp[] listaNotificaciones) {
		for(NotificacionMailyWhatsapp n : listaNotificaciones) {
			if(n.getTipoEnvio().equals("mail")) {
				n.envioPorMail();
			}else {
				n.envioPorWhatsapp();
			}
		}
	}
}

