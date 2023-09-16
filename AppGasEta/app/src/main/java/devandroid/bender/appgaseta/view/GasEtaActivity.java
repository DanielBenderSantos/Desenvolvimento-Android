package devandroid.bender.appgaseta.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import devandroid.bender.appgaseta.R;
import devandroid.bender.appgaseta.apoio.UtilGasEta;

public class GasEtaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaseta);

        Toast.makeText(GasEtaActivity.this, UtilGasEta.calcularMelhoOpcao(5.12,3.39),Toast.LENGTH_LONG).show();
    }



}
