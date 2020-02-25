package jsen.demo1; /*
 *@author Jsen
 *@description
 */

import org.junit.jupiter.api.Test;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        host.rent();
    }
    @Test
    public void proxyText() {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
        proxy.seeHouse();
    }
}
