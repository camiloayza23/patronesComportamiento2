package facadeExample;

public class Seguro {
    private String precio;


    public Seguro(String disponobilidad, String date){
        this.precio =disponobilidad;

    }

    public void amount()    {
        System.out.println("Precio de Seguro "+this.precio );
    }

}