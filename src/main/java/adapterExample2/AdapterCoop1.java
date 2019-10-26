package adapterExample2;

public class AdapterCoop1 implements IBancoBs {
    private Cooperativa1 coop1;
    private double cuenta;
    double monto = SingletonMonto.getInstance().getMonto();
    
    public AdapterCoop1(Cooperativa1 coop1){
        this.coop1=coop1;
    }

    @Override
    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta() {
        this.cuenta =coop1.getCredito()*7;
    }
    @Override
    public void Prestamo() {
        cuenta=cuenta-monto;
    }
}
