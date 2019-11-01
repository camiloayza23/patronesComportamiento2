package facadeExample2;

public class Abogados {
    private String disponobilidad;

    public Abogados(String disponibilidad){
        this.disponobilidad=disponibilidad;
    }

    public void findAbogado()    {
        System.out.println("Abogados disponibles: "+this.disponobilidad);
    }

}