package Singleton;

public class Singleton {
  private static Singleton instance;
  private static int instanceCount = 0;

  private Singleton() {
    instanceCount++;
  }

  public static Singleton getInstance() {
    if (instance == null) {
        instance = new Singleton();
    }
    return instance;
  }

  public int getInstanceCount() {
    return instanceCount;
}
}
