package cn.bigbaic.dao;

import cn.bigbaic.domain.Sale;

import java.util.List;

public interface SaleDao {
    List<Sale> selectSale();
    int insertSale(Sale sale);
}
