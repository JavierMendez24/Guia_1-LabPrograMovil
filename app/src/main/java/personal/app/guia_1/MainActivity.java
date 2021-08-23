package personal.app.guia_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button calculadora;
    Button formulario;
    Button datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculadora = (Button)findViewById(R.id.btnCalculadora);
        formulario = (Button)findViewById(R.id.btnFormulario);
        datos = (Button)findViewById(R.id.btnDatos);

        calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calc = new Intent(MainActivity.this, Calculadora.class);
                startActivity(calc);
            }
        });

        formulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form = new Intent(MainActivity.this, Formulario.class);
                startActivity(form);
            }
        });

        datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dat = new Intent(MainActivity.this, Datos.class);
                startActivity(dat);
            }
        });

    }
}