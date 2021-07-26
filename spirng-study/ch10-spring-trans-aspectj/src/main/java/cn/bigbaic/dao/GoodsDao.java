package cn.bigbaic.dao;

import cn.bigbaic.domain.Goods;

import java.util.List;

/**
 * <h3>ch07-spring-mybatis</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-23 13:17
 **/

public interface GoodsDao {
    List<Goods> selectGoods();
    int insertGoods(Goods goods);
}
