package proxyExample2;

import proxyExample2.Client.Moneda;

public class PersonaRequest {
	
	private int cantidad;
	private Moneda moneda;
	private int guardado = 0;
	private String accion;
	
	public PersonaRequest(int cantidad, Moneda moneda, String accion, int guardado) {
		this.cantidad = cantidad;
		this.moneda = moneda;
		this.accion = accion;
		this.guardado = guardado;
	}
	
	public PersonaRequest() {}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}

	public int getGuardado() {
		return guardado;
	}

	public void setGuardado(int guardado) {
		this.guardado = guardado;
	}

	public String getAccion() {
		return accion;
	}

	public void setAccion(String accion) {
		this.accion = accion;
	}
	
	
	
	
	
	
}
