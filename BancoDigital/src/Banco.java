import java.util.ArrayList;
import java.util.List;

public class Banco {
  private String nome;
  private List<Conta> contas;

  public Banco(String nome) {
    this.nome = nome;
    this.contas = new ArrayList<>();
  }

  public void adicionarConta(Conta conta) {
    this.contas.add(conta);
  }

  public void removerConta(Conta conta) {
    this.contas.remove(conta);
  }

  public void exibirContas() {
    System.out.println("O banco '" + nome + "' tem essas contas: " + this.contas);
  }
}
