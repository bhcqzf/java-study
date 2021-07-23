package cn.bigbaic;

import cn.bigbaic.domain.Goods;
import cn.bigbaic.domain.Sale;
import cn.bigbaic.service.GoodsService;
import cn.bigbaic.service.SaleService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * <h3>ch07-spring-mybatis</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-23 11:56
 **/

public class MyTest {
    @Test
    public void test1(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SaleService service = (SaleService) ctx.getBean("saleService");
        List<Sale> saleList = service.querySale();
        for (Sale sale:
                saleList) {
            System.out.println(sale);
        }
    }
    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        GoodsService service = (GoodsService) ctx.getBean("goodsService");
        List<Goods> goodsList = service.queryGoods();
        for (Goods goods:
             goodsList) {
            System.out.println(goods);
        }
    }
    @Test
    public void test03(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        GoodsService service = (GoodsService) ctx.getBean("goodsService");
        Goods goods = new Goods();
        goods.setId(1003);
        goods.setName("平板");
        goods.setAmount(2000);
        goods.setPrice(1500.0F);
        int res = service.addGoods(goods);
        System.out.println(res==1?"添加商品成功":"添加商品失败");

    }
}
