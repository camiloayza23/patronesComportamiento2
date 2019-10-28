package proxyExample2;

import proxyExample2.Client.Moneda;

public class Cajero implements IBanco{

	private PersonaRequest request;
	private Banco banco = null;
	private int saldo;
		
	public Cajero(PersonaRequest request) {
		this.request = request;
		saldo = this.request.getGuardado();
	}
	
	public void retirar() {
		
	}
	
	public void depositar() {
		
	}

	@Override
	public void request() {
		if(banco == null)
			banco = new Banco(request);
		
		String accion = request.getAccion().toLowerCase();
		
		if (request.getMoneda() == Moneda.Bolivianos) {
			
			if (accion.equals("depositar")) {
				request.setGuardado(request.getGuardado()+request.getCantidad());
				this.banco.request();
			} else if(accion.equals("retirar")) {
				if (request.getGuardado() > request.getCantidad()) {
					request.setGuardado(request.getGuardado()-request.getCantidad());
					this.banco.request();
				} else {
					System.out.println("No cuenta con"
							+ "suficiente saldo en su cuenta ( " + saldo +"Bs. ) para realizar ese retiro, intente de nuevo");
				}
			} else {
				System.out.println("No se puede realizar esa accion!");
			}
		} else {
			System.out.println("No se acepta una transaccion en " + request.getMoneda() + " intente en Bolivianos" );
		}
		
	}
	
	

}
