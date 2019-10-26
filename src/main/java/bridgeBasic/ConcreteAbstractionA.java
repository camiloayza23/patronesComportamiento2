package bridgeBasic;

public class ConcreteAbstractionA implements IAbstraction {
    private Implementor implementor;

    public ConcreteAbstractionA(Implementor implementor){
        this.implementor= implementor;
    }

    @Override
    public void method1() {
        System.out.println("Concreate Abstraction A - method 1");
        this.implementor.operationA();
    }

    @Override
    public void method2() {
        System.out.println("Concreate Abstraction A - method 2");
        this.implementor.operationB();
    }
}