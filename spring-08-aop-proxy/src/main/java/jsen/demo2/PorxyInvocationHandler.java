package jsen.demo2;
/*
 *@author Jsen
 *@description
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//通过此类 自动生成代理
public class PorxyInvocationHandler implements InvocationHandler {


    //被代理的接口
    private Object target;

    public void setRent(Object target) {
        this.target = target;
    }

    //生成代理类
    public Object getProxy() {
        Object instance = Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return instance;
    }

    //处理代理实例 并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(target, args);
        add();
        return invoke;
    }

    public void add() {
        System.out.println("增强此方法");
    }
}
