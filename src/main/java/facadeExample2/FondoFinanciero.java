package facadeExample2;

public class FondoFinanciero {
    private String disponibilidad;


    public FondoFinanciero(String disponibilidad){
        this.disponibilidad =disponibilidad;

    }

    public void fondoDisponible()    {
        System.out.println("Fondo financiero disponible: "+this.disponibilidad );
    }

}