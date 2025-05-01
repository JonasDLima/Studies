package com.example.domain.entities;

import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long CPF;
    private Endereco endereco;

    public Pessoa(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF;
        this.endereco = endereco;
        atualizarIdade();
    }
    protected void atualizarNome(String nome){
        this.nome = nome;
    }
    protected String recuperarNome(){
        return this.nome;
    }
    public void atualizarIdade(){
        this.idade = calcularIdade();
    }
    public int recuperarIdade(){
        return this.idade;
    }
    protected void atualizarCPF(long CPF) {
        this.CPF = CPF;
    }
    protected long recuperarCPF(){
        return this.CPF;
    }
    protected void atualizarEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    protected Endereco recuperarEndereco(){
        return this.endereco;
    }
    private int calcularIdade(){
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(1) - data_nascimento.get(1);
        if((data_nascimento.get(2) > hoje.get(2)) ||
        (data_nascimento.get(2) == hoje.get(2) &&
        data_nascimento.get(3) > hoje.get(3)))
            lapso--;
        return lapso;
    }
}
