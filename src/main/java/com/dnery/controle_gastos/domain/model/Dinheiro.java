package com.dnery.controle_gastos.domain.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public record Dinheiro(BigDecimal valor) {

    public static final Dinheiro ZERO = new Dinheiro(BigDecimal.ZERO);

    public Dinheiro {

        Objects.requireNonNull(valor, "Valor é Obrigatório!");
        if (valor.signum() < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo!");
        }
        valor = valor.setScale(2, RoundingMode.HALF_EVEN);
    }

    public static Dinheiro de(String valor) {
        return new Dinheiro(new BigDecimal(valor));
    }

    public Dinheiro somar(Dinheiro outro) {
        return new Dinheiro(valor.add(outro.valor));
    }

    public Boolean maiorQue(Dinheiro outro) {
        return this.valor.compareTo(outro.valor) > 0;
    }


}
