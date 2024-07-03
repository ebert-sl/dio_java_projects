package Facade;

public class DVDPlayer {
  public void on() {
    System.out.println("O DVD player está ligado");
  }

  public void play(String movie) {
      System.out.println("Reproduzindo " + movie);
  }

  public void off() {
      System.out.println("O DVD player está desligado");
  }
}
