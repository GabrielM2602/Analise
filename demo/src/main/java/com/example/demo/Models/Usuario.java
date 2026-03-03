package com.example.demo.Models;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")


public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String cpf;



}
