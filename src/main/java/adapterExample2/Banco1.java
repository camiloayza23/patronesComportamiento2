package adapterExample2;

public class Banco1 implements IBancoBs {
    private double cuenta;
    double monto = SingletonMonto.getInstance().getMonto();

    @Override
    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void Prestamo() {
        cuenta=cuenta-monto;
    }
}
