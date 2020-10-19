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
    TextView punto ;
    TextView pregunta ;
    ImageView imgView1 ;
    ImageView imgView2;
    Button btn;
    String cadena;
    final int point = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        punto = (TextView) findViewById(R.id.punto);
        pregunta = (TextView) findViewById(R.id.pregunta);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        imgView1 = (ImageView) findViewById(R.id.imgView1);
        imgView2 = (ImageView) findViewById(R.id.imgView2);
        btn = (Button) findViewById(R.id.btn2);
        cadena = point + "/3";




           vuelta(point);

        }

    private void vuelta(int point) {

        if (point == 0) {
            punto.setText(cadena);
            pregunta.setText("¿Cuál es el personaje más inútil?");
            rb1.setText("Sakura");
            rb2.setText("Ino");
            imgView1.setImageResource(R.drawable.sakura);
            imgView2.setImageResource(R.drawable.ino);
            final int finalPoint2 = point;
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rb2.isChecked()) {
                        Intent cargaActivity = new Intent(MainActivity.this, org.iesch.practica2.CargaActivity.class);
                        cargaActivity.putExtra("point", finalPoint2);

                        //System.out.println(point);
                        startActivity(cargaActivity);


                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Respuesta incorrecta", Toast.LENGTH_SHORT);
                        toast.show();
                    }

                }
            });


        }



        if(point == 1){
            punto.setText(cadena);
            pregunta.setText("¿Quién borra más el historial de navegación");
            rb1.setText("Jiraiya");
            rb2.setText("Kakashi");
            imgView1.setImageResource(R.drawable.jiraiya);
            imgView2.setImageResource(R.drawable.kakashi);
            final int finalPoint = point;
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rb1.isChecked()) {
                        Intent cargaActivity = new Intent(MainActivity.this, org.iesch.practica2.CargaActivity.class);
                        cargaActivity.putExtra("point", finalPoint);

                        //System.out.println(point);
                        startActivity(cargaActivity);
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Respuesta incorrecta", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            });
        } if (point == 2){
            punto.setText(cadena);
            pregunta.setText("¿Qué significa Itachi");
            rb1.setText("El más fuerte guerrero");
            rb2.setText("Mala suerte y fatal destino");
            imgView1.setImageResource(R.drawable.itachi1);
            imgView2.setImageResource(R.drawable.itachi2);
            final int finalPoint1 = point;
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (rb2.isChecked()) {
                        Intent cargaActivity = new Intent(MainActivity.this, org.iesch.practica2.CargaActivity.class);
                        cargaActivity.putExtra("point", finalPoint1);

                        //System.out.println(point);
                        startActivity(cargaActivity);
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Respuesta incorrecta", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            });
        }
        point++;
    }



}



