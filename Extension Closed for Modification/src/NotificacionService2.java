
public interface NotificacionService2 {
	
	public void envioNotificaciones (INotificacion[] listaNotificaciones) {
		for(INotificacion n : listaNotificaciones) {
			
			n.envio();
		}
	}
}
