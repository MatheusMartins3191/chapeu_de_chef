package com.example.chapeudechef;

import android.content.Context;
import android.content.Intent;
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBoloDeCarne = findViewById(R.id.btnBoloDeCarne);
        Button btnBrusquetas = findViewById(R.id.btnBrusquetas);
        Button btnFeijoada = findViewById(R.id.btnFeijoada);
        Button btnLasanhaBolonhesa = findViewById(R.id.btnLasanhaBolonhesa);
        Button btnMassaAoAlhoEOlho = findViewById(R.id.btnMassaAoAlhoEOlho);
        Button btnMassaBolonhesa = findViewById(R.id.btnMassaBolonhesa);
        Button btnMassaCarbonara = findViewById(R.id.btnMassaCarbonara);
        Button btnMousseDeChocolate = findViewById(R.id.btnMousseDeChocolate);
        Button btnOvosFritos = findViewById(R.id.btnOvosFritos);
        Button btnOvosMexidos = findViewById(R.id.btnOvosMexidos);
        Button btnPanquecaComFrango = findViewById(R.id.btnPanquecaComFrango);
        Button btnPaoCaseiro = findViewById(R.id.btnPaoCaseiro);
        Button btnPaoDeQueijo = findViewById(R.id.btnPaoDeQueijo);
        Button btnPureDeBatatas = findViewById(R.id.btnPureDeBatata);
        Button btnSopaDeLegumes = findViewById(R.id.btnSopaDeLegumes);
        Button btnStrogonoffDeCarne = findViewById(R.id.btnStrogonoffDeCarne);
        Button btnTortaDeBanana = findViewById(R.id.btnTortaDeBanana);
        Button btnTortaDeFrango = findViewById(R.id.btnTortaDeFrango);
        Button btnTortaDeLimao = findViewById(R.id.btnTortaDeLimao);

        btnTortaDeLimao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ingredientes.class);
                startActivity(intent);
            }
        });

    }
}