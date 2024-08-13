package org.example.service;

import org.example.dto.ContasSaldoDTO;
import org.example.dto.TransacaoDTO;

public class ExecutarTransacaoFinanceiraImpl implements ExecutarTransacaoFinanceira {

    private final AcessoDadosImpl acessoDadosImpl = new AcessoDadosImpl();

    public void transferir(TransacaoDTO transacao) {
        ContasSaldoDTO contaOrigem = acessoDadosImpl.findContaById(transacao.getContaOrigem());

        if (contaOrigem.getSaldo() < transacao.getValor()) {
            System.out.println("Transação número " + transacao.getCorrelationId() + " foi cancelada por falta de saldo");
        } else {
            ContasSaldoDTO contaDestino = acessoDadosImpl.findContaById(transacao.getContaDestino());
            contaOrigem.setSaldo(contaOrigem.getSaldo() - transacao.getValor());
            contaDestino.setSaldo(contaDestino.getSaldo() + transacao.getValor());

            acessoDadosImpl.atualizar(contaOrigem);
            acessoDadosImpl.atualizar(contaDestino);

            System.out.println("Transação número " + transacao.getCorrelationId() +
                    " foi efetivada com sucesso! Novos saldos: Conta Origem: " +
                    contaOrigem.getSaldo() + " | Conta Destino: " + contaDestino.getSaldo());
        }
    }
}

