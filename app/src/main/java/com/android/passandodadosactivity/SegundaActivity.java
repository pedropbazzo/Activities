package com.android.passandodadosactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    public TextView textNome, textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textIdade = findViewById(R.id.textIdadeId);
        textNome = findViewById(R.id.textNomeId);

        //Recuperar dados enviados
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");
        Usuario usuario = (Usuario) dados.getSerializable("objeto");


        //Configurar valores recuperados
        textNome.setText( usuario.getEmail() );

        //String.valueOf() converte inteiro em String
        textIdade.setText( String.valueOf( idade ));
    }
}
