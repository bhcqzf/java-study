package cn.bigbaic;

import cn.bigbaic.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <h3>dstaidaili</h3>
 * <p>handler</p>
 *
 * @author : baibaibai
 * @date : 2021-07-01 15:54
 **/

public class MyInvocationHandler implements InvocationHandler {

    //目标对象
    private Object target;   //SomeServiceImpl类

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        //通过代理对象方法时，会调用这个invoke（）

        Object res = null;

//        System.out.println(method.getName());
        if ( "doSome".equals(method.getName())){
            ServiceTools.doLog();
            //执行目标类的方法，通过Method类实现
            res = method.invoke(target,args);  //SomeServiceImpl.doOther()  doSome()
            ServiceTools.doTrans();
        }else{
            res = method.invoke(target,args);  //SomeServiceImpl.doOther()  doSome()
        }
        return res;
    }
}
