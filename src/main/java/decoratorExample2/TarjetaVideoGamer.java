package decoratorExample2;

public class TarjetaVideoGamer extends Decorator{
	
	private Computadora computadora;
	private int valor = 25;
	
	public TarjetaVideoGamer(Computadora componente){
        super(componente);
        this.computadora = componente;
        valor += computadora.getValor();
    }

	public void defValor(){
        super.defValor();
        System.out.println("Tarjeta de Video añadido. La computadora tiene un valor de: " + getValor());
    }

   
	@Override
	public int getValor() {
		return valor;
	}

}
