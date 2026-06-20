package Singleton;

public class Main {
  public static void main(String[] args) {
    Logger log1 = Logger.getInstance();
    Logger log2 = Logger.getInstance();
    Logger log3 = Logger.getInstance();

    log1.log("Програма запущена");
    log2.log("Користувач увійшов");

    System.out.println(log1 == log2);
    System.out.println(log2 == log3);
  }
}