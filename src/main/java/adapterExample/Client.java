package adapterExample;

public class Client {
	
	public static void main(String []args) {
		Todos todos = new Todos();
		Docente docente = new Docente();
		Director director = new Director();
		Estudiante estudiante = new Estudiante();
		Secretario secretario = new Secretario();
		Seguridad seguridad = new Seguridad();
		seguridad.setNacimiento(1998);
		docente.setNacimiento(1993);	

		AdaptadorDocente adapDocente = new AdaptadorDocente(docente);
		AdaptadorSeguridad adapSeguridad = new AdaptadorSeguridad(seguridad);
		
		director.setEdad(23);
		estudiante.setEdad(15);
		secretario.setEdad(49);
		
		todos.lista(director);
		todos.lista(estudiante);
		todos.lista(secretario);
		todos.lista(adapSeguridad);
		todos.lista(adapDocente);
	}

}
