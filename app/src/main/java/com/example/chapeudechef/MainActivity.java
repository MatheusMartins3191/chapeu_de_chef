package com.example.chapeudechef;

import android.content.Context;
import android.content.Intent;
import android.os.*;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

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

        Intent intent = new Intent(MainActivity.this, ReceitasActivity.class);

        btnTortaDeBanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VibrationEffect vibrationEffect1;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrationEffect1 = VibrationEffect.createOneShot(65, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.cancel();
                    vibrator.vibrate(vibrationEffect1);

                    intent.putExtra("INDICE", 2);
                    startActivity(intent);

                }

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

                    intent.putExtra("INDICE", 1);
                    startActivity(intent);
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

                    startActivity(intent);
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

                    startActivity(intent);
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

                    startActivity(intent);

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

                    startActivity(intent);

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

                    startActivity(intent);

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

                    startActivity(intent);

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

                    startActivity(intent);



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

                    startActivity(intent);

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

                    startActivity(intent);

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

                    intent.putExtra("INDICE", 0);
                    startActivity(intent);

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

                    startActivity(intent);

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

                    startActivity(intent);

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

                    startActivity(intent);

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

                    startActivity(intent);


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

                    startActivity(intent);

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

                    startActivity(intent);

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

                    startActivity(intent);

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

                    startActivity(intent);

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

                    startActivity(intent);

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

                    startActivity(intent);

                }
            }
        });

    }
}