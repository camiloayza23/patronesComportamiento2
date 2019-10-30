package compositeExample2;

public class Item extends Component {
	
	private int suma;

	public Item(int valor){
        super(valor);
    }
	
	public int receiver(int acumulado) {
		suma = acumulado;
		return acumulado;
	}

    @Override
    public void estimacion() {
    	suma += getValor();
    	setEst(suma);
    	System.out.println("La estimacion es: " + this.getEst());
    }

    @Override
    public void add(Component component) {
        System.out.println("not applicable on Leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on Leaf");
    }

    @Override
    public void getChild(int position) {
        System.out.println("\t Leaf :"+this.getValor());
    }
}
