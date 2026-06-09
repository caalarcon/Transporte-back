package com.example.transporte.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transporte {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String tipo;
    private double capacidade;
    private int valor;

    public Transporte(){}

    public Transporte(String nome, String tipo, double capacidade, int valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valor = valor;
    }

    public Transporte(long id, String nome, String tipo, double capacidade, int valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}