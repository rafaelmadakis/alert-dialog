package com.example.alertdialogprojeto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirAlert(View view) {

        /**
         * Criar AlertDialog
         */
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        // Configura título e mensagem
        dialog.setTitle("Título");
        dialog.setMessage("Mensagem");

        //Configura acoes para botão sim ou não
        dialog.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getApplicationContext(), "Sim foi pressionado", Toast.LENGTH_LONG).show();
            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getApplicationContext(), "Não foi pressionado", Toast.LENGTH_LONG).show();
            }

        });

        //Criar e exibir AlertDialog
        dialog.create();
        dialog.show();

    }
}