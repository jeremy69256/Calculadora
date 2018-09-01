package com.example.hp.calculadora;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1;
    EditText num2;
    ImageButton sumar;
    ImageButton restar;
    ImageButton multiplicar;
    ImageButton dividir;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R. id. num1);
        num2 = findViewById(R. id. num2);

        sumar = findViewById(R. id. sumar);
        restar = findViewById(R. id. restar);
        multiplicar = findViewById(R. id. multiplicar);
        dividir = findViewById(R. id. dividir);

        resultado = findViewById(R. id. resultado);

        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        dividir.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        float entero1=Integer.parseInt(n1);
        float entero2=Integer.parseInt(n2);

        float rta=0;

        /*switch (view. getId()) {
            case R.id.sumar:
                rta = entero1 + entero2;
                break;
            case R.id.restar:
                rta = entero1 - entero2;
                break;
            case R.id.multiplicar:
                rta = entero1 * entero2;
                break;
            case R.id.dividir:
                rta = entero1 / entero2;
                break;
        }*/

        if(view.getId() == R.id.sumar)
        {
            rta = entero1 + entero2;
        }
        else
        {
            if(view.getId()==R.id.restar)
            {
                rta = entero1 - entero2;
            }
            else
            {
                if(view.getId() ==R.id.multiplicar)
                {
                    rta = entero1 * entero2;
                }
                else
                {
                    if(view.getId() ==R.id.dividir)
                    {
                        rta = entero1 / entero2;
                    }
                }
            }
        }


      resultado.setText(""+rta);
    }
}