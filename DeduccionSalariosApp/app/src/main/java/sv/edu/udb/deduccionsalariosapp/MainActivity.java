package sv.edu.udb.deduccionsalariosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private EditText txtSalario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText)findViewById(R.id.txtNombre);
        txtSalario = (EditText)findViewById(R.id.txtSalario);

    }

    public void segundaActividad (View v){
        Intent i = new Intent(this, SegundaActividad.class);
        i.putExtra("tvNombre", txtNombre.getText().toString());
        i.putExtra("tvHT", txtSalario.getText().toString());
        startActivity(i);
    }
}