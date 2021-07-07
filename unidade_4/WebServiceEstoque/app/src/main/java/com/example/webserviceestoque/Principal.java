package com.example.webserviceestoque;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Principal extends AppCompatActivity {
        TextView endereço,estoque,nome;
        Button salvar;
        FirebaseDatabase rootNode;
        DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal2);

        endereço = findViewById(R.id.textEndereçoUnidade);
        estoque = findViewById(R.id.textEstoqueUnidade);
        nome = findViewById(R.id.textNomeUnidade);
        salvar = findViewById(R.id.btnSalvar);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference( "Unidade");
                String nomeString = nome.getEditableText().toString();
                String endereçoString = endereço.getEditableText().toString();
                String estoqueString = estoque.getEditableText().toString();
                HelperSalvarUnidade ajudante = new HelperSalvarUnidade(nomeString,endereçoString,estoqueString);
                reference.setValue(ajudante);

            }
        });
    }
}