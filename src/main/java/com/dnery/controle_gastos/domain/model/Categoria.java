package com.dnery.controle_gastos.domain.model;


import java.util.Objects;

public record Categoria(String nome) {

    public Categoria {
        Objects.requireNonNull(nome, "O nome é obrigatório");
        if (nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }

        nome = nome.strip().toUpperCase();
    }
}
