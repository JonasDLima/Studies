package com.example;

import java.util.Calendar;

import com.example.domain.entities.Aluno;
import com.example.domain.entities.Diretor;
import com.example.domain.entities.Empregado;
import com.example.domain.entities.Endereco;
import com.example.domain.entities.Escola;
import com.example.domain.entities.Mascote;
import com.example.domain.entities.Dobermans;
import com.example.domain.entities.Eagles;

public class Main {
    private static Aluno
    aluno0, aluno1,aluno2,aluno3,aluno4,aluno5,aluno6,aluno7,aluno8,aluno9;
    private static Escola escola;
    private static Endereco endereco;
    private static Empregado empregado, diretor;

    public static void main(String[] args) {
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        endereco = new Endereco ();
        endereco.definirPais("Brasil");
        endereco.definirUF("RJ");
        endereco.definirCidade ("Rio de Janeiro");
        endereco.definirRua("Avenida Rio Branco");
        endereco.definirNumero("156A");
        endereco.definirCEP(20040901);
        endereco.definirComplemento("Bloco 03 - Ap 20.005");
        
        aluno0 = new Aluno ("Marco Antônio", data ,901564098 , endereco, "Brasileiro");
        aluno0.atualizarIdade();
        idade = aluno0.recuperarIdade();

        System.out.println("Aluno:" + aluno0);
        
        data.set(1980, 10, 23);
        empregado = new Empregado("Clara Silva", data , 211456937 , null);
        empregado.gerarMatricula();
        diretor = new Diretor ("Marco Antônio", data , 901564098 , null);
        diretor.gerarMatricula();
        System.out.println ("A matrícula do Diretor é: " + diretor.recuperarMatricula());
        System.out.println ("A matrícula do Empregado é: " + empregado.recuperarMatricula());

        System.out.println("Mascotes da escola");
        Mascote dobermans = new Dobermans();
        Mascote eagles = new Eagles();

        dobermans.fraseEfeito();
        dobermans.torcer();    

        eagles.fraseEfeito();  
        eagles.torcer(); 


        System.out.println("Agrupamentos!!");
        escola = new Escola("Escola Pedro Álvares Cabral", "42.336.174/0006-13");
        criarAlunos();
        matricularAlunos();
        escola.agruparAlunos();
        System.out.println("Agrupamentos utilizando Collections!!");
        escola.agruparAlunosCollection();
        escola.agruparAlunosCollection(1);
        escola.agruparAlunosCollection(1.1);
    }

    private static void criarAlunos( ){
        Calendar base_data = Calendar.getInstance();
        
        base_data.set(2012, 11, 23);
        aluno1 = new Aluno("Marco Antônio",
        base_data,
        901564098,
        endereco,
        "Rio de Janeiro");

        base_data.set(2012, 9, 23);
        aluno2 = new Aluno("Clara Silva",
        base_data,
        901564098,
        endereco,
        "Rio de Janeiro");

        base_data.set(2012, 12, 23);
        aluno3 = new Aluno("Marcos Cintra",
        base_data,
        901564098,
        endereco,
        "Sorocaba");

        base_data.set(2012, 1, 23);
        aluno4 = new Aluno("Ana Beatriz",
        base_data,
        901564098,
        endereco,
        "Barra do Pirai");

        base_data.set(2013, 2, 23);
        aluno5 = new Aluno("Marcio Gomes",
        base_data,
        901564098,
        endereco,
        "São Paulo");

        base_data.set(2013, 5, 23);
        aluno6 = new Aluno("João Carlos",
        base_data,
        901564098,
        endereco,
        "Sorocaba");

        base_data.set(2013, 8, 23);
        aluno7 = new Aluno("César Augusto",
        base_data,
        901564098,
        endereco,
        "São Paulo");

        base_data.set(2014, 10, 23);
        aluno8 = new Aluno("Alejandra Gomez",
        base_data,
        901564098 ,
        endereco,
        "Madri");

        base_data.set(2014, 10, 23);
        aluno9 = new Aluno("Castelo Branco",
        base_data,
        901564098,
        endereco,
        "São Paulo");
    }
    private static void matricularAlunos( ){
        escola.matricularAluno(aluno1);
        escola.matricularAluno(aluno2);
        escola.matricularAluno(aluno3);
        escola.matricularAluno(aluno4);
        escola.matricularAluno(aluno5);
        escola.matricularAluno(aluno6);
        escola.matricularAluno(aluno7);
        escola.matricularAluno(aluno8);
        escola.matricularAluno(aluno9);
    }
}