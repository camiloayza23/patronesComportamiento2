package adapterExample;

import java.util.LinkedList;
import java.util.List;

public class Todos {
	List<IPersona> personas = new LinkedList<>();
	private IPersona persona;

	public void lista(IPersona persona) {
		personas.add(persona);
		System.out.println(persona.getEdad());
	}

	public IPersona getPersona() {
		return persona;
	}

	public void setPersona(IPersona persona) {
		this.persona = persona;
	}

}
