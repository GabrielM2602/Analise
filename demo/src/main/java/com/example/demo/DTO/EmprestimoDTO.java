package com.example.demo.DTO;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emprestimos")
public class EmprestimoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 🔗 Usuário que pegou o livro
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserDTO user;

    // 🔗 Livro emprestado
    @ManyToOne
    @JoinColumn(name = "livro_id", nullable = false)
    private LivrosDTO livro;

    // 📅 Data que pegou
    @Column(nullable = false)
    private LocalDate dataEmprestimo;

    // 📅 Data prevista para devolução
    @Column(nullable = false)
    private LocalDate dataDevolucaoPrevista;

    // 📅 Data que realmente devolveu
    private LocalDate dataDevolucaoReal;

    // 🔄 Status do empréstimo
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusEmprestimoDTO status;
}