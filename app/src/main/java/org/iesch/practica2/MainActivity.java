package org.iesch.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rb1, rb2;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView punto = (TextView) findViewById(R.id.punto);
        final TextView pregunta = (TextView) findViewById(R.id.pregunta);
        final RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
        final RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
        final ImageView imgView1 = (ImageView) findViewById(R.id.imgView1);
        final ImageView imgView2 = (ImageView) findViewById(R.id.imgView2);
        final Button btn = (Button) findViewById(R.id.btn);
        final int[] point = {1};
        final String cadena = point[0] + "/3";


        if (point[0] == 1) {
            punto.setText(cadena);
            pregunta.setText("¿Cuál es el personaje más inútil?");
            rb1.setText("Sakura");
            rb2.setText("Ino");
            imgView1.setImageResource(R.drawable.Sakura);
            imgView2.setImageResource(R.drawable.Ino_Yamakana_HD);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rb2.isChecked()) {
                        Intent CargaActivity = new Intent(MainActivity.this, org.iesch.practica2.CargaActivity.class);
                        startActivity(CargaActivity);
                        point[0]++;
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Respuesta incorrecta", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            });
        }else if(point[0] == 2){
            punto.setText(cadena);
            pregunta.setText("");
            rb1.setText("");
            rb2.setText("");
            imgView1.setImageResource(R.drawable.);
            imgView2.setImageResource(R.drawable.);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rb1.isChecked()) {
                        Intent CargaActivity = new Intent(MainActivity.this, org.iesch.practica2.CargaActivity.class);
                        startActivity(CargaActivity);
                        point[0]++;
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Respuesta incorrecta", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            }); 
        } else if (point[0] == 3){
            punto.setText(cadena);
            pregunta.setText("");
            rb1.setText("");
            rb2.setText("");
            imgView1.setImageResource(R.drawable.);
            imgView2.setImageResource(R.drawable.); 
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rb2.isChecked()) {
                        Intent CargaActivity = new Intent(MainActivity.this, org.iesch.practica2.CargaActivity.class);
                        startActivity(CargaActivity);
                        point[0]++;
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Respuesta incorrecta", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            }); 
        }
    }
}
