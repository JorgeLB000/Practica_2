package org.iesch.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
        final int point = 1;
    }
}