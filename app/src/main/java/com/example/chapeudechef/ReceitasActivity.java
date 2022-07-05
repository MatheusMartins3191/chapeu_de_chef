package com.example.chapeudechef;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ReceitasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receitas);

        TextView ingredientes = findViewById(R.id.ingredientes);
        String texto = "não funfou";

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int indice = extras.getInt("INDICE");

            //testes
            if (indice == 0) {
                texto = "torta de limao";
            }
            if (indice == 1) {
                texto = "frango";
            }

            if (indice == 2) {
                texto = "banana";
            }

        }

        ingredientes.setText(texto);



    }
}