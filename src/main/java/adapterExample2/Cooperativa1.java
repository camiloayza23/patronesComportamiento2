package adapterExample2;

public class Cooperativa1 implements ICooperativas {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public void defCredito(int credito) {
        this.credito=credito;
    }
}
