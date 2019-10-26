package bridgeExample;

public class Cuadrado implements IFigura {

	private Color color;
	
	public Cuadrado (Color color) {
		this.color=color;
	}
	@Override
	public void dibujar() {
		System.out.println("Dibujando..");
		color.pintar();
	}

}
