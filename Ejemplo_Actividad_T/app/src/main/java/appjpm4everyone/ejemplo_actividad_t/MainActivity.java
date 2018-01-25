package appjpm4everyone.ejemplo_actividad_t;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click1(View view) {
        //Clase Intent, intencion de hacer algo, en este caso un cambio de actividad
        //En que actividad estoy-- hacia que actividad quiero ir
        Intent miIntent = new Intent(MainActivity.this,IntruccionesActivity.class);
        startActivity(miIntent);

    }
}
