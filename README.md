# Transação Financeira

### Refatorações
- [x] Criação de DTOs dos objetos para organização do código.
- [x] Encapsulamento dos atributos dos DTOs.
- [x] Conversão do atributo contaOrigem para o tipo long.
- [x] Renomeação da função getSaldo para findContaById para melhor. 
- [x] Alteração de ParallelStream para Stream visto que as operações seguem uma ordem de chegada com base no atributo correlationId do objeto TransacaoDTO.
- [x] Criação de testes unitários.

### Dependências Usadas
- JUnit - Testes Unitários

### Linguagem Usada
- Java 17