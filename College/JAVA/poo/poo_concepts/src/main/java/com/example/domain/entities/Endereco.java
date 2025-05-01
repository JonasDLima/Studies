package com.example.domain.entities;

public class Endereco {
    private String pais;
    private String uf;
    private String cidade;
    private String nome_rua;
    private String numero;
    private int CEP;
    private String complemento;

    public void definirPais(String pais){
        this.pais = pais;
    }
    public String recuperaPais(){
        return this.pais;
    }
    public void definirUF(String uf){
        this.uf = uf;
    }
    public String recuperaUF(){
        return this.uf;
    }
    public void definirCidade(String cidade){
        this.cidade = cidade;
    }
    public String recuperaCidade(){
        return this.cidade;
    }
    public void definirRua(String rua){
        this.nome_rua = rua;
    }
    public String recuperaRua(){
        return this.nome_rua;
    }
    public void definirNumero(String numero){
        this.numero = numero;
    }
    public String recuperaNumero(){
        return this.numero;
    }
    public void definirCEP(int CEP){
        this.CEP = CEP;
    }
    public int recuperaCEP(){
        return this.CEP;
    }
    public void definirComplemento(String complemento){
        this.complemento = complemento;
    }
    public String recuperaComplemento(){
        return this.complemento;
    }
}
