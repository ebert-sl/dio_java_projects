package apps.aparelhotelefonico;

public interface AparelhoTelefonico {
  public void ligar(String numero);
  public void atender();
  public void iniciarCorreioVoz();
  private void salvarHistoricoLigacoes(String numero) {};
}
