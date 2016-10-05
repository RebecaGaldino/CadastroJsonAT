package br.edu.ifpb.jsonasynctask.listeners;

import android.content.Intent;
import android.view.View;

import br.edu.ifpb.jsonasynctask.activities.ListarActivity;
import br.edu.ifpb.jsonasynctask.activities.MainActivity;

/**
 * Created by rebeca on 05/10/2016.
 */
public class TelaListagemListener implements View.OnClickListener{

    MainActivity main;

    public TelaListagemListener(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this.main,ListarActivity.class);
        this.main.startActivity(intent);
    }
}
