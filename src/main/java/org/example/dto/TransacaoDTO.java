package org.example.dto;

public class TransacaoDTO {
    private int correlationId;
    private String datetime;
    private long contaOrigem;
    private long contaDestino;
    private int valor;

    public TransacaoDTO(int correlationId, String datetime, long contaOrigem, long contaDestino, int valor) {
        this.correlationId = correlationId;
        this.datetime = datetime;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
    }

    public int getCorrelationId () {
        return correlationId;
    }
    public String getDateTime () {
        return datetime;
    }

    public long getContaOrigem () {
        return contaOrigem;
    }

    public long getContaDestino () {
        return contaDestino;
    }

    public int getValor () {
        return valor;
    }
}
