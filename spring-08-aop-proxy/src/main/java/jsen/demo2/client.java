package jsen.demo2; /*
 *@author Jsen
 *@description
 */

public class client {
    public static void main(String[] args) {
        Host host=new Host();
        PorxyInvocationHandler porxyInvocationHandler = new PorxyInvocationHandler();
        porxyInvocationHandler.setRent(host);
        Rent proxy = (Rent) porxyInvocationHandler.getProxy();
        proxy.rent();

    }
}
