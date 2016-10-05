package br.edu.ifpb.jsonasynctask.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import br.edu.ifpb.jsonasynctask.entities.Pessoa;
import br.edu.ifpb.jsonasynctask.R;
import br.edu.ifpb.jsonasynctask.listeners.CadastrarListener;

public class CadastrarActivity extends Activity {

    private EditText etNome;
    private EditText etEnd;
    private EditText etEmail;
    private EditText etCPF;

    private Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        etNome = (EditText) findViewById(R.id.etNome);
        etEnd = (EditText) findViewById(R.id.etEnd);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etCPF = (EditText) findViewById(R.id.etCPF);



        Button cadastrar = (Button) findViewById(R.id.cadastrar);
        cadastrar.setOnClickListener(new CadastrarListener(this));
    }

    public Pessoa getPessoa(){
        pessoa = new Pessoa(etNome.getText().toString(), etEmail.getText().toString(), etEnd.getText().toString(), etCPF.getText().toString());
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }

    public void limparCampo(){
        this.etNome.setText("");
        this.etEnd.setText("");
        this.etEmail.setText("");
        this.etCPF.setText("");
    }
}
