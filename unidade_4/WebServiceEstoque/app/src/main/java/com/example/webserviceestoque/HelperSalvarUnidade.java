package com.example.webserviceestoque;

public class HelperSalvarUnidade {
    String nome, endereço , estoque;



    public HelperSalvarUnidade(String nome, String endereço, String estoque) {
        this.nome = nome;
        this.endereço = endereço;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }
}
