package com.miguelch96.experimentosapp;

import android.os.Bundle;

/**
 * Created by Miguel on 9/22/2017.
 */

public class Cuenta {
    public static final String EMAIL = "email";
    public static final String PASSWD = "passwd";
    public static final String NOMBRE = "nombre";

    private String nombre;
    private String email;
    private String passwd;

    public Cuenta(String nombre, String email, String passwd) {
        this.setNombre(nombre);
        this.email = email;
        this.passwd = passwd;
    }

    public Cuenta(){

    }


    public String getEmail() {
        return email;
    }

    public Cuenta setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPasswd() {
        return passwd;
    }

    public Cuenta setPasswd(String passwd) {
        this.passwd = passwd;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Cuenta setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Bundle toBundle(){
        Bundle bundle=new Bundle();
        bundle.putString(NOMBRE,nombre);
        bundle.putString(EMAIL,email);
        bundle.putString(PASSWD,passwd);
        return bundle;
    }

    public static Cuenta from(Bundle bundle){
        Cuenta cuenta=new Cuenta();
        cuenta.setEmail(bundle.getString(EMAIL))
                .setPasswd(bundle.getString(PASSWD))
                .setNombre(bundle.getString(NOMBRE));

        return cuenta;
    }


}
