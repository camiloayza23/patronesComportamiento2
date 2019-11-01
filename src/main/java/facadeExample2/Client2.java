package facadeExample2;

import facadeExample2.PrestamoVivienda.Banco;
import facadeExample2.PrestamoVivienda.Coop;

public class Client2 {

	public static void main(String[] args) {

		
		Bancos banco = new Bancos("2", Banco.BancoSol);
        Cooperativas coop = new Cooperativas("3", Coop.COP2);
        FondoFinanciero fonfin= new FondoFinanciero("3");
        Abogados abog = new Abogados("4");
        Notarios not = new Notarios("9");
        Arquitectos arq = new Arquitectos("8");
		
        banco.findBanco();
        coop.findCoop();
        fonfin.fondoDisponible();
        abog.findAbogado();
        not.notarioDisponible();
        arq.findArquitecto();

	}

}