package cn.bigbaic.service.impl;

import cn.bigbaic.dao.SaleDao;
import cn.bigbaic.domain.Sale;
import cn.bigbaic.service.SaleService;

import java.util.List;

/**
 * <h3>ch07-spring-mybatis</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-23 11:51
 **/

public class SaleServiceImpl implements SaleService {
    private SaleDao saleDao;

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    @Override
    public int addSale(Sale sale) {
        int res = this.saleDao.inserSale(sale);
        System.out.println(res);
        return res;
    }

    @Override
    public List<Sale> querySale()
    {
        List<Sale> sales = this.saleDao.selectSale();
        return sales;
    }
}
