package facadeExample2;

public class Notarios {
	
	private String disponibilidad;
	
	public Notarios(String disponibilidad){
        this.disponibilidad=disponibilidad;
    }

    public void notarioDisponible()    {
        System.out.println("Notarios disponibles: "+this.disponibilidad);
    }
}
