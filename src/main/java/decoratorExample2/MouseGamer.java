package decoratorExample2;

public class MouseGamer extends Decorator{
	
	private Computadora computadora;
	private int valor = 15;
	
    public MouseGamer(Computadora componente){
        super(componente);
        this.computadora = componente;
        valor += computadora.getValor();
    }

    public void defValor(){
        super.defValor();
        System.out.println("Mouse Gamer añadido. La computadora tiene un valor de: " + getValor());
    }
    
	@Override
	public int getValor() {
		return valor;
	}

}