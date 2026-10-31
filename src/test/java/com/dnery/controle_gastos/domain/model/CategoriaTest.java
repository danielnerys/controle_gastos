package com.dnery.controle_gastos.domain.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoriaTest {

    @Test
    void nomeValido() {
        assertDoesNotThrow(() -> new Categoria("LAZER"));
    }


    @Test
    void nomeNaoPodeSerVazio() {
        assertThrows(IllegalArgumentException.class, () -> new Categoria(""));
    }

    @Test
    void nomeNaoPodeSerSoEspacos(){
        assertThrows(IllegalArgumentException.class, () -> new Categoria("   "));
    }



    @Test
    void saoIguais(){
        assertEquals(new Categoria("Lazer"), new Categoria("LAZER"));
    }
    @Test
    void ignoraEspacosNasPontas(){
        assertEquals(new Categoria("Lazer"), new Categoria("Lazer  "));
        assertEquals(new Categoria("Lazer"), new Categoria("  Lazer"));
    }

    @Test
    void naoAceitaNomeNullo(){
        assertThrows(NullPointerException.class, () -> new Categoria(null));
    }
}

