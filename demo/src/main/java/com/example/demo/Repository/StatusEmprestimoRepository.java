package com.example.demo.Repository;

public enum StatusEmprestimoRepository {
    EMPRESTADO("Emprestado"),
    DEVOLVIDO("Devolvido"),
    ATRASADO("Atrasado");

    private String descricao;

    StatusEmprestimoRepository(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}