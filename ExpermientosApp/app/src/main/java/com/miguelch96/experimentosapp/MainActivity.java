package com.miguelch96.experimentosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText emailEditText = (EditText) findViewById(R.id.emailEditText);
        final EditText passwdEditText= (EditText) findViewById(R.id.passwdEditText);
        Button ingresarButton= (Button) findViewById(R.id.ingresarButton);


        ingresarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email= String.valueOf(emailEditText.getText());
                String passwd= String.valueOf(passwdEditText.getText());

                if(email.isEmpty() || passwd.isEmpty()){
                    Toast.makeText(view.getContext(),"Debe llenar todos los campos",Toast.LENGTH_LONG).show();
                    return;
                }

                Cuenta cuenta=verificarSiExiste(email,passwd);

                if(cuenta==null){
                    Toast.makeText(view.getContext(),"Email o contraseña incorrecta",Toast.LENGTH_LONG).show();
                    return;
                }

                Intent intent=new Intent(view.getContext(),HomeActivity.class);
                intent.putExtras(cuenta.toBundle());
                startActivity(intent);


            }
        });
    }

    public Cuenta verificarSiExiste(String email, String passwd){

        boolean existe=true;
        List<Cuenta> cuentas=CuentasRepository.getCuentas();
        for(int i=0;i<cuentas.size();i++){
            if(cuentas.get(i).getEmail().equals(email) && cuentas.get(i).getPasswd().equals(passwd))
                return cuentas.get(i);
        }

        return null;
    }
}
