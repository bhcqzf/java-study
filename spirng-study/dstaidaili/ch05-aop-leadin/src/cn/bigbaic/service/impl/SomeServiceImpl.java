package cn.bigbaic.service.impl;

import cn.bigbaic.service.SomeService;

/**
 * <h3>dstaidaili</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-06-30 15:59
 **/

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("doSome");
    }

    @Override
    public void doOther() {
        System.out.println("doOther");
    }
}
