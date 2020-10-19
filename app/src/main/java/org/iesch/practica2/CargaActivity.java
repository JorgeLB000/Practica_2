package org.iesch.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CargaActivity extends AppCompatActivity {

    TextView txtView;
    Button btn2;
    int puntero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga);

        final TextView txtView = (TextView) findViewById(R.id.txtView);
        final Button btn2 = (Button) findViewById(R.id.btn2);



            System.out.println(puntero);



            txtView.setText("Respusta correcta");
            btn2.setText("Volver");
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //
                    //puntero++;
                    //mainActivity.putExtra("puntero", puntero);
                    //
                    setResult(RESULT_OK);
                    //
                    Intent mainActivity = new Intent(CargaActivity.this, MainActivity.class);
                    puntero = mainActivity.getExtras().getInt("point");
                    mainActivity.putExtra("puntero", puntero);
                    onActivityResult(puntero, mainActivity);
                    finish();
                }
            });
        }

    private void onActivityResult(int puntero, Intent mainActivity) {
        puntero=+1;

    }


}
