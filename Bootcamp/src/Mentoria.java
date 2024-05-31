import java.time.LocalDate;

public class Mentoria {
  private String titulo;
  private String descricao;
  private LocalDate data;

  public Mentoria(String titulo, String descricao, LocalDate data) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.data = data;
  }

  public String getTitulo() {
    return titulo;
  }

  public int calcularXP() {
    return 200;
  }

  @Override
  public String toString() {
    return titulo + " | " + descricao + " | " + data;
  }
}
