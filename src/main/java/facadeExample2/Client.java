package facadeExample2;

import facadeExample2.PrestamoVivienda.Banco;
import facadeExample2.PrestamoVivienda.Coop;

public class Client {

	public static void main(String[] args) {
		
		PrestamoVivienda agencia = new PrestamoVivienda("10", Banco.BancoSol, Coop.COP1);
		agencia.find();
		
	}

}