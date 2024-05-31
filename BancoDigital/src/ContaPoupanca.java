public class ContaPoupanca extends Conta {
  private static final double RENDIMENTO = 0.005;

  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  public void aplicarRendimento() {
    saldo += saldo * RENDIMENTO;
    System.out.println("Conta " + numero + " de " + cliente.getNome() + ": Rendimento aplicado. Novo saldo: R$" + saldo);
  }

  @Override
  public String toString() {
    return "Conta Poupança n° " + numero + " de " + cliente.getNome() + " | Agência " + agencia + " | Saldo: R$" + saldo;
  }
}
