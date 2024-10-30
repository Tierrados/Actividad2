public class CajaDeTe implements Paquete{
    int unidades;
    public CajaDeTe(int unidades){
        this.unidades=unidades;
    }
    @Override
    public int numeroDeSobres() {
        return unidades;
    }
}

