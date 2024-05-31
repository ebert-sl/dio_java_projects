public class AtividadeCurso {
  private String titulo;
  private String descricao;
  private int cargaHoraria;

  public AtividadeCurso(String titulo, String descricao, int cargaHoraria) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.cargaHoraria = cargaHoraria;
  }

  public String getTitulo() {
    return titulo;
  }

  public int calcularXP() {
    return 100 * cargaHoraria;
  }

  @Override
  public String toString() {
    return titulo + " | " + descricao + " | " + cargaHoraria + " horas";
  }
}
