package br.edu.ifpb.jsonasynctask.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import br.edu.ifpb.jsonasynctask.R;
import br.edu.ifpb.jsonasynctask.listeners.TelaCadastroListener;
import br.edu.ifpb.jsonasynctask.listeners.TelaListagemListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cadastrar = (Button) findViewById(R.id.btncadastrar);
        Button listar = (Button) findViewById(R.id.btnlistar);

        cadastrar.setOnClickListener(new TelaCadastroListener(this));
        listar.setOnClickListener(new TelaListagemListener(this));
    }

}
