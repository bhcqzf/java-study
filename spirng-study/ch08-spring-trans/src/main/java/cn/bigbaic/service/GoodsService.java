package cn.bigbaic.service;

import cn.bigbaic.domain.Goods;

import java.util.List;

public interface GoodsService {
    int addGoods(Goods goods);
    List<Goods> queryGoods();
}
