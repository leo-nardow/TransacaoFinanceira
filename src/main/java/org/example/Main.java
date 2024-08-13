package org.example;

import org.example.dto.TransacaoDTO;
import org.example.service.ExecutarTransacaoFinanceiraImpl;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<TransacaoDTO> transacoes = List.of(
                new TransacaoDTO(1, "09/09/2023 14:15:00",
                        938485762, 2147483649L, 150),
                new TransacaoDTO(2, "09/09/2023 14:15:05",
                        2147483649L, 210385733, 149),
                new TransacaoDTO(3, "09/09/2023 14:15:29",
                        347586970, 238596054, 1100),
                new TransacaoDTO(4, "09/09/2023 14:17:00",
                        675869708, 210385733, 5300),
                new TransacaoDTO(5, "09/09/2023 14:18:00",
                        238596054, 674038564, 1489),
                new TransacaoDTO(6, "09/09/2023 14:18:20",
                        573659065, 563856300, 49),
                new TransacaoDTO(7, "09/09/2023 14:19:00",
                        938485762, 2147483649L, 44),
                new TransacaoDTO(8, "09/09/2023 14:19:01",
                        573659065, 675869708, 150)
        );

        ExecutarTransacaoFinanceiraImpl executor = new ExecutarTransacaoFinanceiraImpl();

        transacoes.forEach(executor::transferir);

    }
}

