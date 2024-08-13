package org.example.service;

import org.example.dto.TransacaoDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExecutarTransacaoFinanceiraImplTest {
    final ExecutarTransacaoFinanceiraImpl underTest = new ExecutarTransacaoFinanceiraImpl();
    final TransacaoDTO transacaoDTO = new TransacaoDTO(1, "09/09/2023 14:15:00",
            938485762, 2147483649L, 150);
    @Test
    void ItShouldTransferTheAmountCorrectly() {
        assertDoesNotThrow(() ->{
            underTest.transferir(transacaoDTO);
        });
    }
}