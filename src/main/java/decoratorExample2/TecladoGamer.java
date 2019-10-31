package decoratorExample2;

public class TecladoGamer extends Decorator{
    private Computadora computadora;
    private int valor = 10;

    public TecladoGamer(Computadora componente){
        super(componente);
        this.computadora = componente;
        valor += computadora.getValor();
    }

    public void defValor(){
        super.defValor();
        System.out.println("Teclado Gamer añadido. La computadora tiene un valor de: " + getValor());
    }

	@Override
	public int getValor() {
		return valor;
	}

}
