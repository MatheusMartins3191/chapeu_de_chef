package com.example.chapeudechef;

import android.content.Context;
import android.content.Intent;
import android.os.*;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.chapeudechef.receitas.ReceitaTortaDeBanana;

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

        final Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        btnTortaDeBanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }

                Intent intent = new Intent (MainActivity.this, ReceitaTortaDeBanana.class);
                startActivity(intent);

            }
        });

        btnTortaDeFrango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnStrogonoffDeCarne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnSopaDeLegumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnPureDeBatatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnPaoDeQueijo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnPaoCaseiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnPanquecaComFrango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnOvosMexidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnOvosFritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnMassaBolonhesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnTortaDeLimao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnBrusquetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnBoloDeCarne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnFeijoada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnLasanhaBolonhesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnLasanhaBolonhesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnMassaAoAlhoEOlho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnMassaAoAlhoEOlho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnMassaCarbonara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnMassaCarbonara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });
        btnMousseDeChocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);
                }
            }
        });

    }
}