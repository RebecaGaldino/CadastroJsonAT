package br.edu.ifpb.jsonasynctask.listeners;

import android.view.View;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

import br.edu.ifpb.jsonasynctask.activities.CadastrarActivity;
import br.edu.ifpb.jsonasynctask.asynctask.CadastrarAsyncTask;

/**
 * Created by rebeca on 05/10/2016.
 */
public class CadastrarListener implements View.OnClickListener {

    private CadastrarActivity activity;

    public CadastrarListener(CadastrarActivity activity){
        this.activity = activity;
    }


    @Override
    public void onClick(View view) {
        CadastrarAsyncTask c = new CadastrarAsyncTask();

        try {
            String msg = c.execute(activity.getPessoa()).get();
            Toast toast = Toast.makeText(activity, msg, Toast.LENGTH_SHORT);
            activity.limparCampo();

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
