public abstract class PaqueteDecorador implements Paquete{
    protected Paquete paqueteDecorado;

    public PaqueteDecorador(Paquete paqueteDecorado) {
        this.paqueteDecorado = paqueteDecorado;
    }

    @Override
    public int numeroDeSobres() {
        return paqueteDecorado.numeroDeSobres();
    }
}

