package lab6;

import java.util.List;
import java.util.Arrays;

class ProxyInternet implements Internet {
  private Internet realInternet = new RealInternet();
  private static final List<String> bannedSites = Arrays.asList("blockedSite1.com", "blockedSite2.com");

  @Override
  public void connectTo(String serverHost) throws Exception {
    if (bannedSites.contains(serverHost.toLowerCase())) {
      throw new Exception("Access Denied");
    }
    realInternet.connectTo(serverHost);
  }
}