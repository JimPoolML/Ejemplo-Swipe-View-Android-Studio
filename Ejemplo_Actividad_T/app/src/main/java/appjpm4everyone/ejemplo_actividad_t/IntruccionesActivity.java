package appjpm4everyone.ejemplo_actividad_t;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IntruccionesActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intrucciones);



    }

    public void Click2(View view) {

        Intent miIntent2 = null;

        //Switch case
        switch (view.getId()){

            case R.id.btnRegresar:
            //Clase Intent, intencion de hacer algo, en este caso un cambio de actividad
            //En que actividad estoy-- hacia que actividad quiero ir
            miIntent2 = new Intent(IntruccionesActivity.this,MainActivity.class);
            break;

            case R.id.btnContinuar:
            //Clase Intent, intencion de hacer algo, en este caso un cambio de actividad
            //En que actividad estoy-- hacia que actividad quiero ir
             miIntent2 = new Intent(IntruccionesActivity.this,FinalActivity.class);
            break;


        }//Final Switch -- case

        startActivity(miIntent2);
    }

}
