package com.toposdeus.controldelpaciente;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class NuevoRegistro extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    Button atras;
    CheckBox alergiaschbx;
    EditText nombreedtx, alergiasedtx;
    String[] fechadenacieminto = new String[3];
    RadioButton masc, fem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_nuevo_registro);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        masc = findViewById(R.id.rdbtnmasc);
        fem = findViewById(R.id.rdbtnfem);
        nombreedtx = findViewById(R.id.nombre);
        alergiasedtx = findViewById(R.id.alergiastxt);
        atras = findViewById(R.id.atras);
        alergiaschbx = findViewById(R.id.alergiaschbx);
        atras.setOnClickListener(this);
        alergiaschbx.setOnCheckedChangeListener(this);
        TextView titulo = findViewById(R.id.titulo);
        titulo.setText(getResources().getText(R.string.NuevoRegistro));
        spinner(this, R.id.spinnerdia, 0, dias("Dia"));
        spinner(this, R.id.spinnermes, 1, meses("Mes"));
        spinner(this, R.id.spinneraño, 2, años("Año"));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        Date date = new Date();

        String fecha = dateFormat.format(date);
        TextView txfecha  = findViewById(R.id.fecha);
        txfecha.setText(fecha);
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


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            alergiasedtx.setVisibility(View.VISIBLE);
        } else {
            alergiasedtx.setVisibility(View.GONE);
        }
    }

    private void spinner(Context context, int idspinner, final int tipo, List<String> dato) {
        Spinner spinnerm = findViewById(idspinner);
        ArrayAdapter adaptadorm = new ArrayAdapter(context, R.layout.item_spinner, dato);
        spinnerm.setAdapter(adaptadorm);
        spinnerm.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position != 0)
                    fechadenacieminto[tipo] = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    private List<String> años(String titulo) {
        List<String> anos = new ArrayList<>();
        anos.add(titulo);
        for (int i = 100; i > 0; i--) {
            anos.add("" + (i + 1918));
        }

        return anos;
    }

    private List<String> meses(String titulo) {
        List<String> meses = new ArrayList<>();
        meses.add(titulo);
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Nomviembre");
        meses.add("Diciembre");
        return meses;
    }

    private List<String> dias(String titulo) {
        List<String> dias = new ArrayList<>();
        dias.add(titulo);
        for (int i = 31; i > 0; i--) {
            dias.add("" + i);
        }
        return dias;
    }
}
