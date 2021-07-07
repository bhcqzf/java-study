package cn.bigbaic.service.impl;

import cn.bigbaic.service.SomeService;

/**
 * <h3>ch02-di-xml</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-06-30 15:15
 **/

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行doSome");
    }

    @Override
    public void doOther() {
        System.out.println("执行doOther");
    }
}
