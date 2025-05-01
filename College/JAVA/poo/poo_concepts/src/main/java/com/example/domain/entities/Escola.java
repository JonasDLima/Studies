package com.example.domain.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Escola {
    private String nome, CNPJ;
    private Endereco endereco;
    private ArrayList<Departamento> departamentos;
    private ArrayList<Aluno> discentes;

    public Escola(String nome, String CNPJ){
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<Departamento>();
        this.discentes = new ArrayList<Aluno>();
    }
    public void criarDepartamento(String nomeDepartamento){
        departamentos.add(new Departamento(nomeDepartamento));
    }
    public void fecharDepartamento(Departamento departamento){
        departamentos.remove(departamento);
    }
    public void matricularAluno(Aluno novoAluno){
        discentes.add(novoAluno);
    }
    public void trancarMatriculaAluno(Aluno aluno){
        discentes.remove(aluno);
    }
    public void agruparAlunos(){
        Map<String, List<Aluno>> agrupamento = new HashMap<>();
        for (Aluno a: discentes) {
            if(!agrupamento.containsKey(a.recuperarNaturalidade())){
                agrupamento.put(a.recuperarNaturalidade(), new ArrayList<>());
            }
            agrupamento.get(a.recuperarNaturalidade()).add(a);
        }
        System.out.println("Resultado do agrupamento por naturalidade:" + agrupamento);
    }
    public void agruparAlunosCollection(){
        Map<String, List<Aluno>> agrupamento =
        discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade));
        System.out.println("Resultado do agrupamento collection por naturalidade: ");
        agrupamento.forEach((String chave, List<Aluno> lista) -> 
            System.out.println(chave+" = "+lista)
        );
    }
    public void agruparAlunosCollection(int a){
        Map<String, Set<Aluno>> agrupamento =
        discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade, Collectors.toSet()));
        System.out.println("Resultado do agrupamento collection por naturlidade: ");
        agrupamento.forEach((String chave, Set<Aluno> conjunto) -> 
            System.out.println(chave+" = "+conjunto)
        );
    }
    public void agruparAlunosCollection(double a){
        Map<String, Set<Aluno>> agrupamento =
        discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade, TreeMap::new, Collectors.toSet()));
        System.out.println("Resultado do agrupamento collection por naturlidade: ");
        agrupamento.forEach((String chave, Set<Aluno> conjunto) -> 
            System.out.println(chave+" = "+conjunto)
        );
    }
}
