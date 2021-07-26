package cn.bigbaic;

import cn.bigbaic.domain.Goods;
import cn.bigbaic.domain.Sale;
import cn.bigbaic.service.BuyService;
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
    @Test
    public void test04(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SaleService service = (SaleService) ctx.getBean("saleService");
        Sale sale = new Sale();
        sale.setId(1);
        sale.setGid(1001);
        sale.setNums(10);
        int res = service.addSale(sale);
        System.out.println(res == 1 ? "更新成功" : "更新失败");
    }

    @Test
    public void test05(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);


        GoodsService service = (GoodsService) ctx.getBean("goodsService");
        Goods goods = new Goods();
        goods.setId(1004);
        goods.setName("平板1");
        goods.setAmount(2000);
        goods.setPrice(1500.0F);
        int res = service.addGoods(goods);

        System.out.println(res==1?"添加商品成功":"添加商品失败");

        SaleService saleService = (SaleService) ctx.getBean("saleService");
        Sale sale = new Sale();
        sale.setId(2);
        sale.setGid(1002);
        sale.setNums(10);
        int saleRes = saleService.addSale(sale);
        System.out.println(saleRes == 1 ? "更新成功" : "更新失败");
    }
    @Test
    public void test06(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        BuyService service = (BuyService) ctx.getBean("buyService");
        service.buy(10010,20);

    }

}
