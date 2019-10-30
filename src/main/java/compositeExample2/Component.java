package compositeExample2;

abstract class Component {

	private int valor;
	private int est;    
		
	public void setEst(int est) {
		this.est = est;
	}
		
	public int getEst() {
		return est;		
	}
	
	public int getValor() {
		return valor;
	}

	public Component(int valor) {
		this.valor = valor;
	}

	public int receiver(int acumulado) {
		return acumulado;
	}
	
	public abstract void estimacion();
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void getChild(int position);
}
