package sv.edu.udb.deduccionsalariosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class SegundaActividad extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvISSS;
    private TextView tvAFP;
    private TextView tvRenta;
    private TextView tvSalario;
    private TextView tvSalSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        tvNombre = (TextView)findViewById(R.id.tvNombre);
        tvISSS = (TextView)findViewById(R.id.tvISSS);
        tvAFP = (TextView)findViewById(R.id.tvAFP);
        tvRenta = (TextView)findViewById(R.id.tvRenta);
        tvSalario = (TextView)findViewById(R.id.tvSalario);
        tvSalSD = (TextView)findViewById(R.id.tvSalSD);

        Bundle bundle = getIntent().getExtras();
        String nombre = bundle.getString("tvNombre");
        String HT = bundle.getString("tvHT");
        double SalarioSD = Double.parseDouble(HT) * 8.50;
        double disss = SalarioSD * 0.02;
        double dafp = SalarioSD * 0.03;
        double drenta = SalarioSD * 0.04;
        double SalNeto = SalarioSD - (disss + dafp + drenta);


        tvNombre.setText("Nombre: " + nombre);
        tvSalSD.setText("Salario sin descuento: $" + String.format("%.2f", SalarioSD));
        tvISSS.setText("Descuento ISSS: $"+ String.format("%.2f", disss));
        tvAFP.setText("Descuento AFP: $"+ String.format("%.2f", dafp));
        tvRenta.setText("Descuento Renta: $"+ String.format("%.2f", drenta));
        tvSalario.setText("Salario Neto: $"+ String.format("%.2f", SalNeto));
    }

    public void finalizar(View v){
        finish();
    }
}