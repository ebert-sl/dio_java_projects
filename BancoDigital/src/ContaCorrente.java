public class ContaCorrente extends Conta {
  private double limiteChequeEspecial = 1000.0;

  public ContaCorrente(Cliente cliente) {
    super(cliente);
  }

  public void cobrarTaxaManutencao() {
    double taxa = 20.0;
    if (saldo >= taxa) {
      saldo -= taxa;
      System.out.println("Conta " + numero + " de " + cliente.getNome() + ": Taxa de R$" + taxa + " debitada.");
    } else {
      System.err.println("Conta " + numero + " de " + cliente.getNome() + ": Saldo insuficiente para debitar taxa de manutenção.");
    }
  }

  @Override
  public void sacar(double valor) {
    if (saldo < valor) {
      if (saldo + limiteChequeEspecial < valor) {
        System.out.println("Conta " + numero + " de " + cliente.getNome() + ": Não há saldo na conta e nem no cheque especial para o saque.");
      } else {
        double saqueRestante = valor - saldo;
        saldo = 0;
        limiteChequeEspecial -= saqueRestante;
        System.out.println("Conta " + numero + " de " + cliente.getNome() + ": Saldo zerado e cheque especial utilizado. Saldo do cheque: R$" + limiteChequeEspecial);
      }
    } else {
      saldo -= valor;
      System.out.println("Conta " + numero + " de " + cliente.getNome() + ": R$" + valor + " debitados. Novo saldo: R$" + saldo);
    }
  }

  @Override
  public String toString() {
    return "Conta Corrente n° " + numero + " de " + cliente.getNome() + " | Agência " + agencia + " | Saldo: R$" + saldo;
  }
}
