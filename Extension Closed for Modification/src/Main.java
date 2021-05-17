
public class Main {
	public static void main(String[] args) {
		String textoPromocion = "Camisas a 9,99, señooooooraaaaaa...";
		
		NotificacionMailyWhatsapp n1 = new NotificacionWhatsapp("Jonnan","eljonandebaraka@gmail.com", textoPromocion);
		NotificacionMailyWhatsapp n2 = new NotificacionMail("Jessica","lajessy@gmail.com", textoPromocion);
		NotificacionMailyWhatsapp n3 = new NotificacionTelegram("juany","lajuani99@gmail.com", textoPromocion);
		NotificacionMailyWhatsapp n4 = new NotificacionMail("manolito","manolito@gmail.com", textoPromocion);
		
	INotificacion[] listaNotificaciones = {n1,n2,n3,n4};
		
		NotificacionService2 ns2 = new NotificacionService2();
		
		ns2.envioNotificaciones(listaNotificaciones);
	}
}
