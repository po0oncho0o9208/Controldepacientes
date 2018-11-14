package com.toposdeus.controldelpaciente;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Ajustes extends AppCompatActivity implements View.OnClickListener {
    Button atras;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ajustes);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        atras = findViewById(R.id.atras);
        atras.setOnClickListener(this);
        TextView titulo = findViewById(R.id.titulo);
        titulo.setText(getResources().getText(R.string.Ajustes));


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.atras:
                Intent atras = new Intent(this, MenuPrincipal.class);
                startActivity(atras);
                finish();
                break;
        }

    }
}
