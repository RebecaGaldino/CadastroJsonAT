package br.edu.ifpb.jsonasynctask.listeners;

import android.content.Intent;
import android.view.View;

import br.edu.ifpb.jsonasynctask.activities.CadastrarActivity;
import br.edu.ifpb.jsonasynctask.activities.MainActivity;

/**
 * Created by rebeca on 05/10/2016.
 */
public class TelaCadastroListener implements View.OnClickListener{
    MainActivity main;

    public TelaCadastroListener(MainActivity main){
        this.main = main;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this.main,CadastrarActivity.class);
        this.main.startActivity(intent);

    }
}
