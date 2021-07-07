package cn.bigbaic;

import cn.bigbaic.service.SomeService;
import cn.bigbaic.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <h3>dstaidaili</h3>
 * <p>myapp</p>
 *
 * @author : baibaibai
 * @date : 2021-06-30 16:00
 **/

public class MyApp {
    public static void main(String[] args) {
        //创建目标对象
        SomeService target = new SomeServiceImpl();
        //创建InvocationHandler对象
        InvocationHandler ih = new MyInvocationHandler(target);
        //使用Proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                ih);
        proxy.doSome();
        proxy.doOther();
    }
}
