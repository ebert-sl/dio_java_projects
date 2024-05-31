public abstract class Conta {
  private static int sequencial = 1;

  protected int agencia = 1;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;

  protected Conta(Cliente cliente) {
    this.numero = sequencial++;
    this.cliente = cliente;
  }

  public void sacar(double valor) {
    if (saldo < valor) {
      System.out.println("Conta " + numero + " de " + cliente.getNome() + ": Saldo insuficiente para saque.");
    } else {
      saldo -= valor;
      System.out.println("Conta " + numero + " de " + cliente.getNome() + ": R$" + valor + " debitados. Novo saldo: R$" + saldo);
    }
  };
  
  public void depositar(double valor) {
    saldo += valor;
    System.out.println("Conta " + numero + " de " + cliente.getNome() + ": R$" + valor + " depositados. Novo saldo: R$" + saldo);
  }
  
  public void transferir(double valor, Conta conta) {
    if (saldo < valor) {
      System.out.println("Conta " + numero + " de " + cliente.getNome() + ": Saldo insuficiente para transferência.");
    } else {
      sacar(valor);
      conta.depositar(valor);
      System.out.println("Conta " + numero + " de " + cliente.getNome() + ": R$" + valor + " transferidos para " + conta.cliente.getNome() + ".");
    }
  }
}
