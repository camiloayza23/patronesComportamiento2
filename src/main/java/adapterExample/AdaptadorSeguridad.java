package adapterExample;

public class AdaptadorSeguridad implements IPersona{
	
	private Seguridad segDocente = new Seguridad();
	private int edad;
	
	public AdaptadorSeguridad(Seguridad segDocente) {
		this.segDocente = segDocente;
	}

	@Override
	public int getEdad() {
		edad = this.segDocente.calcularEdad();
		return edad;
	}

	@Override
	public void setEdad(int edad) {
		edad = this.segDocente.calcularEdad();
	}

}

