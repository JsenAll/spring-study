package jsen.demo1;
/*
 *@author Jsen
 *@description
 */

public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    public void rent() {
        host.rent();
    }

    //添加一些额外的功能
    public  void  seeHouse(){
        System.out.println("看房");
    }
}
