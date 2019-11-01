package facadeExample2;

import facadeExample2.PrestamoVivienda.Banco;

public class Bancos {
    private String disponibilidad;
    private Banco banco;

    public Bancos(String disponibilidad, Banco banco){
        this.disponibilidad=disponibilidad;
        this.banco = banco;
        
    }

    public void findBanco(){
        System.out.println("Buscando banco "+this.banco+ " con disponibilidad: " + this.disponibilidad);
    }

}