import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
  private String nome;
  private String descricao;
  private LocalDate dataInicial;
  private LocalDate dataFinal;
  private List<Dev> devs;
  private List<Mentoria> mentorias;
  private List<AtividadeCurso> atividadesCursos;

  public Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal) {
    this.nome = nome;
    this.descricao = descricao;
    this.dataInicial = dataInicial;
    this.dataFinal = dataFinal;
    this.devs = new ArrayList<>();
    this.mentorias = new ArrayList<>();
    this.atividadesCursos = new ArrayList<>();
  }

  public String getNome() {
    return nome;
  }
  public List<Mentoria> getMentorias() {
    return mentorias;
  }
  public List<AtividadeCurso> getAtividadesCursos() {
    return atividadesCursos;
  }

  public void inscreverDev(Dev dev) {
    devs.add(dev);
  }

  public void adicionarMentoria(Mentoria mentoria) {
    mentorias.add(mentoria);
    System.out.println("Mentoria '" + mentoria.getTitulo() + "' adicionado com sucesso.");
  }

  public void adicionarAtividadeCurso(AtividadeCurso atividadeCurso) {
    atividadesCursos.add(atividadeCurso);
    System.out.println("Atividade/Curso '" + atividadeCurso.getTitulo() + "' adicionado com sucesso.");
  }
}
