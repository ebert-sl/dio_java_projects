import apps.aparelhotelefonico.AparelhoTelefonico;
import apps.navegadorinternet.NavegadorInternet;
import apps.reprodutormusical.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void reproduzir() {
        System.out.println("Reproduzindo música");
    };
    public void pausar() {
        System.out.println("Pausando música");
    };
    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo " + musica);
    };

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
        salvarHistoricoLigacoes(numero);
    }
    public void atender() {
        System.out.println("Atendendo ligação");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    private void salvarHistoricoLigacoes(String numero) {
        System.out.println("Salvando número no histórico");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página desta URL: " + url);
        salvarHistoricoNavegador(url);
    }
    public void adicionarNovaAba() {
        System.out.println("Criando nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    private void salvarHistoricoNavegador(String url) {
        System.out.println("Salvando página no histórico");
    }
}
