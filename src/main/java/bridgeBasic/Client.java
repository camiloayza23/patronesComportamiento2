package bridgeBasic;

public class Client {
    public static void main (String []args){

        ImplementadorA implementadorA = new ImplementadorA();
        ConcreteAbstractionA concreateAbstractionA = new ConcreteAbstractionA(implementadorA);
        concreateAbstractionA.method1();
        concreateAbstractionA.method2();
    }
}
