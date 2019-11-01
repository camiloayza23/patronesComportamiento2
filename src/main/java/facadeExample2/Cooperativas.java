package facadeExample2;

import facadeExample2.PrestamoVivienda.Coop;

public class Cooperativas {
    private String disponobilidad;
    private Coop coop;

    public Cooperativas(String disponobilidad, Coop coop){
        this.disponobilidad=disponobilidad;
        this.coop = coop;
    }

    public void findCoop()    {
        System.out.println("Cooperativa "+this.coop+ " con disponibilidad: " + this.disponobilidad);
    }

}