package com.mikemyzhao.FactoryPattern.FactoryPatternNormal;


/***
 * 工厂模式
 * 优点：1、封装性好 2、可扩展性好 3、屏蔽产品类 4、典型的解耦框架
 */

import com.mikemyzhao.FactoryPattern.FactoryPatternNormal.Factory.ConcreteCreator;
import com.mikemyzhao.FactoryPattern.FactoryPatternNormal.Factory.Creator;
import com.mikemyzhao.FactoryPattern.FactoryPatternNormal.Products.ConcreteProduct1;
import com.mikemyzhao.FactoryPattern.FactoryPatternNormal.Products.Product;

public class Client {
    public static void main(String[] args){
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /**
         * 继续处理业务
         */

    }
}
