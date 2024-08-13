package org.example.service;

import org.example.dto.TransacaoDTO;

public interface ExecutarTransacaoFinanceira {
    void transferir(TransacaoDTO transacao);
}
