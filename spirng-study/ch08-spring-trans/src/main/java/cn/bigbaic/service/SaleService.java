package cn.bigbaic.service;

import cn.bigbaic.domain.Sale;

import java.util.List;

public interface SaleService {
    int addSale(Sale sale);
    List<Sale> querySale();
}
