package proxyExample2;

public class Client {
	
	enum Moneda {Bolivianos, Dolares, Euros};
	
	public static void main(String[] args) {
		// Create proxy
		PersonaRequest p1 = new PersonaRequest();
		p1.setGuardado(150);
		p1.setAccion("retirar");
		p1.setCantidad(25);
		p1.setMoneda(Moneda.Bolivianos);
		
		IBanco proxy = new Cajero(p1);
		
		IBanco proxy2 = new Cajero(new PersonaRequest(30, Moneda.Dolares, "depositar", 150));
		
		proxy.request();
		proxy.request();
		
		proxy2.request();
		
	}
}
