package decoratorExample2;

public class MonitorSamsung extends Decorator{
	
	private Computadora computadora;
	private int valor = 50;
	
    public MonitorSamsung(Computadora componente){
        super(componente);
        this.computadora = componente;
        valor += computadora.getValor();
    }

    public void defValor(){
        super.defValor();
        System.out.println("Monitor Samsung añadido. La computadora tiene un valor de: " + getValor());
    }

	@Override
	public int getValor() {
		return valor;
	}

}