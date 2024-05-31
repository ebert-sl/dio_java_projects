# Criando um Banco Digital com Java e Orientação a Objetos

Implementação de um banco por linha de comando, com dois tipos de conta disponíveis: Conta Corrente e Conta Poupança. Nesse projeto foram treinados os pilares da Orientação a Objetos: Abstração, Encapsulamento, Herança e Polimorfismo.

## Como Executar

1. Realize o download ou clone do repositório base
2. Entre na pasta src
3. Compile o arquivo App.java pela IDE ou Editor de Texto de sua preferência (recomendo Eclipse ou Visual Studio Code)

## Como Usar

1. Entre na pasta src
2. Abra o arquivo App.java
3. Use os construtores e métodos públicos das classes Banco, ContaCorrente, ContaPoupanca e Cliente.
- Banco(String nome):
  - adicionarConta(Conta conta)
  - removerConta(Conta conta)
  - exibirContas()
- ContaCorrente(Cliente cliente):
  - sacar(double valor)
  - depositar(double valor)
  - transferir(double valor, Conta conta)
  - cobrarTaxaManutencao()
- ContaPoupanca(Cliente cliente):
  - sacar(double valor)
  - depositar(double valor)
  - transferir(double valor, Conta conta)
  - aplicarRendimento()
- Cliente(String nome, String cpf)