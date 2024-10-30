import java.util.ArrayList;

public class PaqueteDeCajas implements Paquete {
    private ArrayList<Paquete> cajas;

    public PaqueteDeCajas() {
        this.cajas = new ArrayList<>();
    }

    public void add(Paquete paquete) {
        System.out.println("Añado una caja de " + paquete.getClass().getSimpleName());
        cajas.add(paquete);
    }

    void remove(Paquete paquete) {
        cajas.remove(paquete);
    }

    ArrayList<Paquete> getCajas() {
        return cajas;
    }

    @Override
    public int numeroDeSobres() {
        int cuenta = 0;
        for (Paquete paquete : cajas)
            cuenta += paquete.numeroDeSobres();
        return cuenta;
    }

}
