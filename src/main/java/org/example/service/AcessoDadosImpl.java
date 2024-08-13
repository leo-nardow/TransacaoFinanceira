package org.example.service;

import org.example.dto.ContasSaldoDTO;

import java.util.ArrayList;
import java.util.List;

public class AcessoDadosImpl implements AcessoDados {
    private List<ContasSaldoDTO> tabelaSaldos;

    public AcessoDadosImpl() {
        tabelaSaldos = new ArrayList<>();
        tabelaSaldos.add(new ContasSaldoDTO(347586970, 1200));
        tabelaSaldos.add(new ContasSaldoDTO(2147483649L, 0));
        tabelaSaldos.add(new ContasSaldoDTO(675869708, 4900));
        tabelaSaldos.add(new ContasSaldoDTO(238596054, 478));
        tabelaSaldos.add(new ContasSaldoDTO(573659065, 787));
        tabelaSaldos.add(new ContasSaldoDTO(210385733, 10));
        tabelaSaldos.add(new ContasSaldoDTO(674038564, 400));
        tabelaSaldos.add(new ContasSaldoDTO(563856300, 1200));
        tabelaSaldos.add(new ContasSaldoDTO(938485762, 180));
    }
    @Override
    public boolean atualizar(ContasSaldoDTO dado) {
        try {
            tabelaSaldos.removeIf(conta -> conta.getConta() == dado.getConta());
            tabelaSaldos.add(dado);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public ContasSaldoDTO findContaById(long id) {
        return tabelaSaldos.stream()
                .filter(conta -> conta.getConta() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Conta não encontrada: " + id));
    }
}
