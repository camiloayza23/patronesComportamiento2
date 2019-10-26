package adapterExample2;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args){
        Cooperativa1 c1 = new Cooperativa1();
        Cooperativa2 c2 = new Cooperativa2();
        AdapterCoop1 adapterC1 = new AdapterCoop1(c1);
        AdapterCoop2 adapterC2 = new AdapterCoop2(c2);
        Banco1 banco1 = new Banco1();
        Banco3 union = new Banco3();
        Banco2 prodem = new Banco2();

        c1.defCredito(5);
        c2.defCredito(5);

        adapterC1.setCuenta();
        adapterC2.setCuenta();
        banco1.setCuenta(10);
        union.setCuenta(12);
        prodem.setCuenta(9);
        ArrayList<IBancoBs> bancos=new ArrayList<>();
        bancos.add(adapterC1);
        bancos.add(adapterC2);
        bancos.add(banco1);
        bancos.add(union);
        bancos.add(prodem);
        for (int i = 0; i <bancos.size(); i++) {
            bancos.get(i).Prestamo();
            System.out.println(bancos.get(i).getCuenta() +" Bs");
        }

    }
}
