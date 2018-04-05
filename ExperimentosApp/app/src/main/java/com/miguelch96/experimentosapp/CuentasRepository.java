package com.miguelch96.experimentosapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miguel on 9/22/2017.
 */

public class CuentasRepository {


    public static List<Cuenta> getCuentas(){
        List<Cuenta> cuentas;
        cuentas=new ArrayList<>();
        cuentas.add(new Cuenta("miguel","miguel@gmail.com","12345"));
        cuentas.add(new Cuenta("david","david@gmail.com","12345"));
        cuentas.add(new Cuenta("sergio","sergio@gmail.com","12345"));
        return cuentas;
    }


}
