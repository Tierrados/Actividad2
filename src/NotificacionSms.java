
public class NotificacionSms extends PaqueteDecorador {
    public NotificacionSms(Paquete paquete) {
        super(paquete);
    }

    @Override
    public int numeroDeSobres() {
        int cantidad = super.numeroDeSobres();
        enviaNotificacionSms(cantidad);
        return cantidad;
    }

    public void enviaNotificacionSms(int cantidad){
        System.out.println("Notificación por SMS: Envío de " + cantidad + " unidades.");
    }
}
