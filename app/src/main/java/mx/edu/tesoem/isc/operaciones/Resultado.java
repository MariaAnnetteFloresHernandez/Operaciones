package mx.edu.tesoem.isc.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView resultadolbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultadolbl = findViewById(R.id.result);
        int valor = getIntent().getExtras().getInt("resultado");
        resultadolbl.setText(String.valueOf(valor));

    }
}