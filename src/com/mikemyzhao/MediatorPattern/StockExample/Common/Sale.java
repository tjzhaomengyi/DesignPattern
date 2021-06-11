package com.mikemyzhao.MediatorPattern.StockExample.Common;

import java.util.Random;

public class Sale {
    //销售IBM电脑
    public void sellIBMComputer(int number){
        Stock stock = new Stock();
        //访问采购
        Purchase purchase = new Purchase();
        if(stock.getStockNumber()<number){ //库存不够销售量
            purchase.buyIBMcomputer(number);
        }
        System.out.println("销售电脑"+number+"台");
        stock.decrease(number);
    }

    //反馈销售情况，0-100之间变化，0代表根本就没人卖，100代表非常畅销，出一个卖一个
    public int getSaleStatus(){
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况："+saleStatus);
        return saleStatus;
    }

    //折价处理
    public void offSale(){
        //库房有多少卖多少
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑"+stock.getStockNumber());
    }
}
