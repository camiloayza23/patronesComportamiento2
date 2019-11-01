package facadeExample2;

public class PrestamoVivienda {
    //Facade
	
	enum Banco {BancoSol, MS};
	enum Coop {COP1, COP2};
	
    private Bancos encBanco;
    private Cooperativas encCooperativa;
    private FondoFinanciero encFondoFinanciero;
    private Abogados encAbogado;
    private Notarios encNotario;
    private Arquitectos encArquitecto;

    public PrestamoVivienda(String disponibilidad, Banco banco, Coop coop){
        encBanco = new Bancos(disponibilidad, banco);
        encCooperativa = new Cooperativas(disponibilidad, coop);
        encFondoFinanciero= new FondoFinanciero(disponibilidad);
        encAbogado = new Abogados(disponibilidad);
        encNotario = new Notarios(disponibilidad);
        encArquitecto = new Arquitectos(disponibilidad);
    }

    public void find(){

        encBanco.findBanco();
        encCooperativa.findCoop();
        encFondoFinanciero.fondoDisponible();
        encAbogado.findAbogado();
        encNotario.notarioDisponible();
        encArquitecto.findArquitecto();

    }

}