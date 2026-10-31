package com.dnery.controle_gastos.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DinheiroTest {

    @Test
    void SomaDoisValores() {
        assertEquals(Dinheiro.de("10.50"), Dinheiro.de("10.00").somar(Dinheiro.de("0.50")));
    }

    @Test
    void valoresComEscalaDiferenteSaoIguais() {
        assertEquals(Dinheiro.de("10.00"), Dinheiro.de("10"));
    }

    @Test
    void valorTemQueSerMaior() {
        assertTrue(Dinheiro.de(("50")).maiorQue(Dinheiro.de("10.00")));
    }

    @Test
    void naoAceitaValorNulo(){
        assertThrows(IllegalArgumentException.class, () -> Dinheiro.de("-1"));
    }

}