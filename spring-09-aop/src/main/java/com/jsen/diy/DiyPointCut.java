package com.jsen.diy; /*
 *@author Jsen
 *@description
 */

import org.springframework.stereotype.Component;

@Component
public class DiyPointCut {
    public void before() {
        System.out.println("在你前面执行");
    }

    public void after() {
        System.out.println("后面执行");

    }
}
