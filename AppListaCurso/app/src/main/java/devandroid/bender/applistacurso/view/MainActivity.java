package devandroid.bender.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.bender.applistacurso.R;
import devandroid.bender.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;


    EditText editPrimeiroNome;
    EditText editSobreNome;
    EditText editNomeCurso;
    EditText editTelefoneContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinallizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //atribuir conteudo , dados ,valores para o objeto
        pessoa.setPrimeiroNome("Daniel");
        pessoa.setSobreNome("Bender");
        pessoa.setCursoDesejado("Java");
        pessoa.setTelefoneContato("11-12345678");

        //outraPessoa = new Pessoa();
        //outraPessoa.setPrimeiroNome("Bruna");
        //outraPessoa.setSobreNome("Bender");
        //outraPessoa.setCursoDesejado("Java");
        //outraPessoa.setTelefoneContato("11-5432234");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNome = findViewById(R.id.editSobreNome);
        editNomeCurso = findViewById(R.id.editNomeCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinallizar = findViewById(R.id.btnFinalizar);
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editSobreNome.setText("");
                editNomeCurso.setText("");
                editTelefoneContato.setText("");
            }
        });

        btnFinallizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volte Sempre",Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobreNome.getText().toString());
                pessoa.setCursoDesejado(editNomeCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo " + pessoa.toString(),Toast.LENGTH_LONG).show();

            }
        });
        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobreNome.setText(pessoa.getSobreNome());
        editNomeCurso.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());



        dadosPessoa = "Primero nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += "Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += "Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += "Telefone de contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        //dadosOutraPessoa = "Primero nome: ";
        //dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        //dadosOutraPessoa += "Sobrenome: ";
        //dadosOutraPessoa += outraPessoa.getSobreNome();
        //dadosOutraPessoa += "Curso Desejado: ";
        //dadosOutraPessoa += outraPessoa.getCursoDesejado();
        //dadosOutraPessoa += "Telefone de contato: ";
        //dadosOutraPessoa += outraPessoa.getTelefoneContato();

        Log.i("POOAndroid", pessoa.toString());
        //Log.i("POOAndroid", outraPessoa.toString());

    }
}