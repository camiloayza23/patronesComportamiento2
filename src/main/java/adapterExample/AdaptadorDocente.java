package adapterExample;

public class AdaptadorDocente implements IPersona{
	
	private Docente docente = new Docente();
	private int edad;
	
	public AdaptadorDocente(Docente docente) {
		this.docente = docente;
	}

	@Override
	public int getEdad() {
		edad = this.docente.calcularEdad();
		return edad;
	}

	@Override
	public void setEdad(int edad) {
		edad = this.docente.calcularEdad();
	}

}
