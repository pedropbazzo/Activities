package com.android.passandodadosactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoDados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoDados = findViewById(R.id.botaoDadosId);

        botaoDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //abre uma nova activity
                //O Intent mostra ao android qual é a nossa itenção
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //instanciar o objeto
                Usuario usuario = new Usuario("Caroline", "borges_cah@hotmail.com");

                //passar dados
                intent.putExtra("nome", "Caroline");
                intent.putExtra("idade", 27);

                //quando converte um objeto em Serializable conseguimos tranmitir ele de uma activity para outra
                intent.putExtra("objeto", usuario);

                startActivity( intent );
            }
        });

    }
}
