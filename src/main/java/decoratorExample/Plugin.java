package decoratorExample;

public class Plugin extends Decorator{
    public Plugin(Ide componente){
        super(componente);
    }

    public void operation(){
        super.operation();
        addedBehavior();
        System.out.println("Plugins");
    }

    public void addedBehavior(){
        System.out.println("Add new Plugin");
    }
}