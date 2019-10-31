package decoratorExample2;

public class Computadora2019 implements Computadora{
	
    public void defValor(){
    	System.out.println("Creando una computadora 2019...");
    }

    @Override
	public int getValor() {
		return valor;
	
	}
    
}