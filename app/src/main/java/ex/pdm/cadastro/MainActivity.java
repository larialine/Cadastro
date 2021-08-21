package ex.pdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText telefone;
    private EditText email;
    private CheckBox listaEmail;
    private RadioButton sexoM;
    private RadioButton sexoF;
    private EditText cidade;
    private Spinner estado;
    private Button botaoLimpar;
    private Button botaoSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.nomeEt);
        telefone = findViewById(R.id.telefoneEt);
        email = findViewById(R.id.emailEt);
        listaEmail = findViewById(R.id.listaEmailCb);
        sexoM = findViewById(R.id.mascRb);
        sexoF = findViewById(R.id.femRb);
        cidade = findViewById(R.id.cidadeEt);
        estado = findViewById(R.id.estadoSp);
        botaoLimpar = findViewById(R.id.limparBt);
        botaoSalvar = findViewById(R.id.salvarBt);

    }

    public void LimparCampos(View view){
        nome.setText("");
        telefone.setText("");
        email.setText("");
        listaEmail.setChecked(false);
        sexoF.setChecked(true);
        sexoM.setChecked(true);
        cidade.setText("");
        //estado?
    }

    public void SalvarDados(View view){
        String nomeCompleto = nome.getText().toString();
        String tel = telefone.getText().toString();
        String em = email.getText().toString();
        //listaEmail.isChecked() ? "primeiro" : "segundo"
        //sexoF.isChecked() ? "primeiro" : "segundo"
        //sexoF.isChecked() ? "primeiro" : "segundo"
        String cid = cidade.getText().toString();
        //Estado est = String nomeCompleto = ;

        Formulario form = new Formulario(nomeCompleto, tel, em);
        Toast.makeText(this, form.toString(), Toast.LENGTH_SHORT).show();

    }
}