package adapterExample;

public class Secretario implements IPersona{
	
	private int edad;
	
	@Override
	public int getEdad() {
		return edad;
	}

	@Override
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
