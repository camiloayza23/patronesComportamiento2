package adapterExample2;

public class AdapterCoop2 implements IBancoBs {
    private Cooperativa2 c2;
    private double cuenta;
    double monto=SingletonMonto.getInstance().getMonto();
    
    public AdapterCoop2(Cooperativa2 c2){
        this.c2=c2;
    }

    @Override
    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta() {
        this.cuenta =c2.getCredito()*7;
    }
    
    @Override
    public void Prestamo() {
        cuenta=cuenta-monto;
    }
}
