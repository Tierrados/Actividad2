
public class NotificacionEmail extends PaqueteDecorador {
    public NotificacionEmail(Paquete paquete) {
        super(paquete);
    }

    @Override
    public int numeroDeSobres() {
        int cantidad = super.numeroDeSobres();
        enviaNotificacionEmail(cantidad);
        return cantidad;
    }

    public void enviaNotificacionEmail(int cantidad){
        System.out.println("Notificación por correo: Envío de " + cantidad + " unidades.");
    }
}
