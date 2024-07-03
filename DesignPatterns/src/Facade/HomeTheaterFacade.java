package Facade;

public class HomeTheaterFacade {
  private DVDPlayer dvdPlayer;
  private Amplifier amplifier;
  private Projector projector;
  
  public HomeTheaterFacade(DVDPlayer dvdPlayer, Amplifier amplifier, Projector projector) {
      this.dvdPlayer = dvdPlayer;
      this.amplifier = amplifier;
      this.projector = projector;
  }
  
  public void watchMovie(String movie) {
      System.out.println("Se prepare para assistir o filme...");
      projector.on();
      amplifier.on();
      amplifier.setVolume(5);
      dvdPlayer.on();
      dvdPlayer.play(movie);
  }
  
  public void endMovie() {
      System.out.println("Desligando o home theater...");
      dvdPlayer.off();
      amplifier.off();
      projector.off();
  }
}
