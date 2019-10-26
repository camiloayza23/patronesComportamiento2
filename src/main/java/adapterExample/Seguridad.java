package adapterExample;

public class Seguridad implements IPersona2 {
	
	private int nacimiento;
	
	public int getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	@Override
	public int calcularEdad() {
		return 2019 - nacimiento;
	}

}
