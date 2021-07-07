package com.example.webserviceestoque;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    TextView endereço2,estoque2,nome2;
    Button salvar2;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        endereço2 = findViewById(R.id.textEstoqueUnidade2);
        estoque2 = findViewById(R.id.textEstoqueUnidade2);
        nome2 = findViewById(R.id.textNomeUnidade2);
        salvar2 = findViewById(R.id.btnSalvar2);
        reference = FirebaseDatabase.getInstance().getReference().child("Unidade");
        salvar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                inserirUnidade();



            }
        });


    }
    private void inserirUnidade(){
        String nomeString = nome2.getText().toString();
        String endereçoString = endereço2.getText().toString();
        String estoqueString = estoque2.getText().toString();
        HelperSalvarUnidade ajudante = new HelperSalvarUnidade(nomeString,endereçoString,estoqueString);
        reference.push().setValue(ajudante);
        Toast.makeText(MainActivity.this,"Dados inseridos",Toast.LENGTH_SHORT).show();


    }
}