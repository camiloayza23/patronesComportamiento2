package proxyExample2;

public class Banco implements IBanco {

	PersonaRequest request;
	
	public Banco(PersonaRequest request) {
		this.request = request;
	}


	@Override
	public void request() {
		System.out.println("Se solicito " + request.getAccion() + " la cantidad de " + request.getCantidad()
		+ "Bs. La transaccion fue EXITOSA! Su saldo disponible es " + request.getGuardado() + "Bs");
	}

}
