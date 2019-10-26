package bridgeBasic;

public class ConcreteAbstractionB implements IAbstraction {
    private Implementor implementor;

    public ConcreteAbstractionB(Implementor implementor){
        this.implementor= implementor;
    }

    @Override
    public void method1() {
        System.out.println("Concreate Abstraction B - method 1");
        this.implementor.operationA();
    }

    @Override
    public void method2() {
        System.out.println("Concreate Abstraction B - method 2");
        this.implementor.operationB();
    }
}
