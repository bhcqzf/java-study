package cn.bigbaic.service.impl;

import cn.bigbaic.Utils.EnougthException;
import cn.bigbaic.dao.GoodsDao;
import cn.bigbaic.dao.SaleDao;
import cn.bigbaic.domain.Goods;
import cn.bigbaic.domain.Sale;
import cn.bigbaic.service.BuyService;
import org.springframework.transaction.annotation.Transactional;

/**
 * rollbackFor:表示发生指定异常一定回滚
 **/

public class BuyServiceImpl implements BuyService {
    private GoodsDao goodsDao;
    private SaleDao saleDao;

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

/*    @Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {
                    NullPointerException.class,
                    EnougthException.class
            }
    )*/
    @Transactional
    @Override
    public void buy(Integer goodsId, Integer nums) {
        Goods goods = new Goods();
        goods.setId(goodsId);
        goods.setAmount(nums);
        goods.setName("undefined");
        goods.setPrice(100F);
        goodsDao.insertGoods(goods);

        if ( nums > 20 ){
            throw new EnougthException("数量过大异常");
        }
        Sale sale = new Sale();
        sale.setNums(nums);
        sale.setId(goodsId);
        sale.setGid(111);
        saleDao.insertSale(sale);
    }
}
