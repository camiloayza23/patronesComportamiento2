package compositeExample2;

import java.util.ArrayList;

public class Composite extends Component {
	
    private ArrayList<Component> list = new ArrayList<>();
    private int acumulado;
    
    public int getAcumulado() {
		return acumulado;
	}

	public Composite(int valor){
        super(valor);
    }

    @Override
    public void estimacion() {
        // some actions when we do iteration with list
        for (Component comp: list) {
        	comp.receiver(acumulado);
            comp.estimacion();
            acumulado += comp.getValor();
        }

    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getValor());
    }

}