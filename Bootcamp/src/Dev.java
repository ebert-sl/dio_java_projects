import java.util.ArrayList;
import java.util.List;

public class Dev {
  private String nome;
  private List<Mentoria> mentorias;
  private List<AtividadeCurso> atividadesCursos; 
  private int xp;

  public Dev(String nome) {
    this.nome = nome;
    this.mentorias = new ArrayList<>();
    this.atividadesCursos = new ArrayList<>();
  }

  public String getNome() {
    return nome;
  }
  public int getXP() {
    return xp;
  }

  public void inscreverNoBootcamp(Bootcamp bootcamp) {
    bootcamp.inscreverDev(this);
    mentorias = bootcamp.getMentorias();
    atividadesCursos = bootcamp.getAtividadesCursos();
    System.out.println(nome + ", você foi inscrito com sucesso no Bootcamp " + bootcamp.getNome() + "!");
  }

  public void progredirAtividadeCurso(AtividadeCurso atividadeCurso) {
    if (atividadesCursos.stream().anyMatch((atividade) -> atividade == atividadeCurso)) {
      xp += atividadeCurso.calcularXP();
      System.out.println(nome + ": Atividade/Curso completo! Você recebeu " + atividadeCurso.calcularXP() + " XP! XP total: " + xp);
    } else {
      System.out.println("Essa atividade/curso não está na sua lista, " + nome + ".");
    }
  }

  public void progredirMentoria(Mentoria mentoria) {
    if (mentorias.stream().anyMatch((m) -> m == mentoria)) {
      xp += mentoria.calcularXP();
      System.out.println(nome + ": Mentoria completa! Você recebeu " + mentoria.calcularXP() + " XP! XP total: " + xp);
    } else {
      System.out.println("Essa mentoria não está na sua lista, " + nome + ".");
    }
    
  }

  public void exibirMentorias() {
    System.out.println("Mentorias de " + nome + ": " + mentorias);
  }

  public void exibirCursos() {
    System.out.println("Cursos e Atividades de " + nome + ": " + atividadesCursos);
  }
}
