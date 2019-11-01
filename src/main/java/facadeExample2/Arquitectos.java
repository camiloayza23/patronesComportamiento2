package facadeExample2;

public class Arquitectos {
	private String disponibilidad;
	
	public Arquitectos(String disponibilidad){
        this.disponibilidad=disponibilidad;
    }

    public void findArquitecto()    {
        System.out.println("Arquitectos disponibles: "+this.disponibilidad);
    }
}
