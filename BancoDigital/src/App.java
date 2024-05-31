public class App {
  public static void main(String[] args) {
    Banco banco = new Banco("Banco do Brasil");
    Cliente cliente = new Cliente("Ébert", "000.000.000-00");
    ContaCorrente contaCorrente = new ContaCorrente(cliente);
    ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);

    banco.adicionarConta(contaCorrente);
    banco.adicionarConta(contaPoupanca);
    banco.exibirContas();

    contaCorrente.depositar(400);
    contaCorrente.sacar(1500);
    contaCorrente.sacar(100);
    contaCorrente.sacar(600);
    contaCorrente.transferir(100, contaPoupanca);
    contaCorrente.depositar(1000);
    contaCorrente.cobrarTaxaManutencao();

    contaPoupanca.depositar(400);
    contaPoupanca.sacar(500);
    contaPoupanca.sacar(100);
    contaPoupanca.aplicarRendimento();
    contaPoupanca.transferir(100, contaCorrente);

    banco.exibirContas();
  }
}
