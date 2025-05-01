package com.example.domain.entities;

import java.util.Calendar;
import java.util.UUID;

public class Aluno extends Pessoa {
    private String matricula, naturalidade;

    public Aluno(String nome, Calendar data_nascimento, long CPF, Endereco endereco, String naturalidade){
        super(nome, data_nascimento, CPF, endereco);
        this.naturalidade = naturalidade;
    }
    public String recuperarNaturalidade(){
        return this.naturalidade;
    }
    public void gerarMatricula(){
        matricula = "A-" + UUID.randomUUID().toString();
    }
    public String recuperarMatricula(){
        return this.matricula;
    }

    @Override
    public String toString(){
        return String.format("%s(%s)",recuperarNome(), naturalidade);
    }
}
