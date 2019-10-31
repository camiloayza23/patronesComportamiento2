package decoratorExample2;

public abstract class Decorator implements Computadora{
    private Computadora componente;

    public Decorator(Computadora componente){
        this.componente = componente;
    }

    public void defValor(){
        componente.defValor();
    }
}