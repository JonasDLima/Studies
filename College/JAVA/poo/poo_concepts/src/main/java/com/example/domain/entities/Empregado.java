package com.example.domain.entities;

import java.util.Calendar;

public class Empregado extends Pessoa {
    protected String matricula;
    private Calendar data_admissao , data_demissao;
    
    public Empregado(String nome, Calendar data_nascimento, long CPF, Endereco endereco){
        super(nome, data_nascimento, CPF, endereco);
        gerarMatricula();
        this.data_admissao = Calendar.getInstance();
    }
    public void demitirEmpregado(){
        data_demissao = Calendar.getInstance();
    }
    public void gerarMatricula(){
        this.matricula = "Matrícula não definida.";
    }
    public String recuperarMatricula() {
        return this.matricula;
    }
}
