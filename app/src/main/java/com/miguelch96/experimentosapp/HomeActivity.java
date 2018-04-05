package com.miguelch96.experimentosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Cuenta cuenta=Cuenta.from(getIntent().getExtras());

        TextView bienvenidaTextView= (TextView) findViewById(R.id.bienvenidaTextView);
        Button cerrarsesionTextView= (Button) findViewById(R.id.cerrarsesionButton);

        bienvenidaTextView.setText("Bienvenido "+cuenta.getNombre());

        cerrarsesionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(),MainActivity.class));
            }
        });


    }
}
