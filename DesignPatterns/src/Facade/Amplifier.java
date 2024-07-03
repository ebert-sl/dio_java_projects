package Facade;

public class Amplifier {
  public void on() {
    System.out.println("O amplificador está ligado");
  }

  public void setVolume(int level) {
      System.out.println("Mudando volume para " + level);
  }

  public void off() {
      System.out.println("O amplificador está desligado");
  }
}
