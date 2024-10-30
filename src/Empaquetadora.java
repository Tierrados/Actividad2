public class Empaquetadora {
    public static void main(String[] args) {
        PaqueteDeCajas paquete1=new PaqueteDeCajas();
        paquete1.add(new CajaDeTeBlanco());
        paquete1.add(new CajaDeTeBlanco());
        paquete1.add(new CajaDeTeVerde());

        PaqueteDeCajas paquete2=new PaqueteDeCajas();
        paquete2.add(new CajaDeTeVerde());
        paquete2.add(new CajaDeTeVerde());
        paquete2.add(new CajaDeTeBlanco());

        PaqueteDeCajas envioAsia = new PaqueteDeCajas();
        envioAsia.add(paquete1);
        envioAsia.add(paquete2);
        Paquete envioConNotificacion = new NotificacionEmail(envioAsia);
        Paquete envioConSms = new NotificacionSms(envioAsia);

        System.out.println(
                "Este paquete tiene "+
                    paquete1.numeroDeSobres()+
                    " unidades");
        System.out.println(
                "Este paquete tiene "+
                        paquete2.numeroDeSobres()+
                        " unidades");
        System.out.println(
                "Este paquete tiene "+
                        envioAsia.numeroDeSobres()+
                        " unidades");
        System.out.println(
                "El envío a Asia contiene "+
                        envioAsia.numeroDeSobres()+
                        " unidades de té");
        envioConNotificacion.numeroDeSobres();
        envioConSms.numeroDeSobres();

    }
}
