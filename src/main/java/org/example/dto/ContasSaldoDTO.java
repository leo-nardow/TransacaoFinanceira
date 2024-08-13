package org.example.dto;

public class ContasSaldoDTO {
    private long conta;
    private int saldo;

    public ContasSaldoDTO(long conta, int saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public long getConta() {
        return conta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
