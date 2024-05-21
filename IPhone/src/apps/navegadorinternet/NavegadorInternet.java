package apps.navegadorinternet;

public interface NavegadorInternet {
  public void exibirPagina(String url);
  public void adicionarNovaAba();
  public void atualizarPagina();
  private void salvarHistoricoNavegador(String url) {};
}
