package bridgeExample;

public class Cliente {
	public static void main(String[] args) {
		Blanco blanco = new Blanco();
		
		Circulo circ = new Circulo(blanco);
		circ.dibujar();
	}
}
