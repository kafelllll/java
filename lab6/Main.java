package lab6;

public class Main {
  public static void main(String[] args) {
    Internet internet = new ProxyInternet();

    try {
      internet.connectTo("google.com");
      internet.connectTo("blockedSite1.com");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
