package decoratorExample;

public class Tools extends Decorator{
    private String attribute1;

    public Tools(Ide componente){
        super(componente);
    }

    public void operation(){
        super.operation();
        this.attribute1 = "Tools";
        System.out.println("Adding "+attribute1);
    }
}
