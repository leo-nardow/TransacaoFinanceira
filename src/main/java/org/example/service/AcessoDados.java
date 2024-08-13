package org.example.service;

import org.example.dto.ContasSaldoDTO;

public interface AcessoDados {
    boolean atualizar(ContasSaldoDTO dado);
    ContasSaldoDTO findContaById(long id);
}
