package org.example.service;

import org.example.dto.ContasSaldoDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcessoDadosImplTest {
    final AcessoDadosImpl undertest = new AcessoDadosImpl();
    final ContasSaldoDTO contasSaldoDTO = new ContasSaldoDTO(123456789,50);
    @Test
    void ShouldReturnTrueWhenPassingAValidParameter() {
        assertTrue(undertest.atualizar(contasSaldoDTO));
    }
    @Test
    void ShouldReturnThrowExceptionWhenPassingAInvalidParameter() {
        AcessoDadosImpl undertestNull = null;

        assertThrows(NullPointerException.class, () -> {
            undertestNull.atualizar(contasSaldoDTO);
        });
    }
    @Test
    void ShouldFindTheAccountWhenPassingTheCorrectId() {
        undertest.atualizar(contasSaldoDTO);
        Assertions.assertEquals(undertest.findContaById(123456789),contasSaldoDTO);
    }

    @Test
    void ShouldNotFindTheAccountWhenPassingTheIncorrectId() {
        undertest.atualizar(contasSaldoDTO);
        assertThrows(RuntimeException.class, () -> {
            undertest.findContaById(987654321);
        });
    }
}