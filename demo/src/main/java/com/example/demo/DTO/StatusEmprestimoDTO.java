package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum StatusEmprestimoDTO {
    EMPRESTADO("Emprestado"),
    DEVOLVIDO("Devolvido"),
    ATRASADO("Atrasado");

    private String descricao;

    public void StatusEmprestimo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}