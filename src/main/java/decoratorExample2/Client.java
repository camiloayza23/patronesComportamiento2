package decoratorExample2;

public class Client {
    public static void main(String[] args) {
        Computadora gamingComputer = new Computadora2019();
        gamingComputer = new TecladoGamer(gamingComputer);
        gamingComputer = new MouseGamer(gamingComputer);
        gamingComputer = new TarjetaVideoGamer(gamingComputer);
        gamingComputer = new MonitorSamsung(gamingComputer);
        
        gamingComputer.defValor();
    }
}
