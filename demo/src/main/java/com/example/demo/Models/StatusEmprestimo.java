package com.example.demo.Models;

public enum StatusEmprestimo {
    EMPRESTADO("Emprestado"),
    DEVOLVIDO("Devolvido"),
    ATRASADO("Atrasado");

    private String descricao;

    StatusEmprestimo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}