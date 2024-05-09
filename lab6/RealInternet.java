package lab6;

class RealInternet implements Internet {
  @Override
  public void connectTo(String serverHost) {
    System.out.println("Connecting to " + serverHost);
  }
}