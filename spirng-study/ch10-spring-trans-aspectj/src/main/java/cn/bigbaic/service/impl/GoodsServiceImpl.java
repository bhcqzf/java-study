package cn.bigbaic.service.impl;

import cn.bigbaic.dao.GoodsDao;
import cn.bigbaic.domain.Goods;
import cn.bigbaic.service.GoodsService;

import java.util.List;

/**
 * <h3>ch07-spring-mybatis</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-23 13:29
 **/

public class GoodsServiceImpl implements GoodsService {
    private GoodsDao goodsDao;

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    public int addGoods(Goods goods) {
        int res = this.goodsDao.insertGoods(goods);
        return res;
    }

    @Override
    public List<Goods> queryGoods() {
        List<Goods> goodsList = this.goodsDao.selectGoods();
        return goodsList;
    }
}
