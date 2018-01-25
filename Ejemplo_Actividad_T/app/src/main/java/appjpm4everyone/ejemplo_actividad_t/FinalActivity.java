package appjpm4everyone.ejemplo_actividad_t;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
    }

    public void Click3(View view) {
        //Destruye la actividad, regresando a la actividad que la invocó
        finish();
    }
}
