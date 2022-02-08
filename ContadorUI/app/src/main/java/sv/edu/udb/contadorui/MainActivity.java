package sv.edu.udb.contadorui;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvNumero;
    private int sumado;
    private int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNumero = (TextView)findViewById(R.id.tvNumero);

    }

    public void Sumar(View v){
        String num = tvNumero.getText().toString();
        n = Integer.parseInt(num);
        if(n==9){
            n=0;
            sumado = n;
        }else {
            sumado = n+1;
        }
        String completo = Integer.toString(sumado);
        tvNumero.setText(completo);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("sumado",sumado);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        n = savedInstanceState.getInt("sumado");
        tvNumero.setText(String.valueOf(n));
    }
}