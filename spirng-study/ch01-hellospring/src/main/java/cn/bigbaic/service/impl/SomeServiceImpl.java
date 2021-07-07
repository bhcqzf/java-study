package cn.bigbaic.service.impl;

import cn.bigbaic.service.SomeService;

public class SomeServiceImpl implements SomeService {


    public SomeServiceImpl(){
        System.out.println("无参数构造方法");
    }



    @Override
    public void doSome() {
        System.out.println("执行了someservice的doSome");
    }
}
