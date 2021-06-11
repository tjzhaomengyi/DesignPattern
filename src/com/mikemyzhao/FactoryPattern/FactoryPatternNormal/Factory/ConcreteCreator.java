package com.mikemyzhao.FactoryPattern.FactoryPatternNormal.Factory;

import com.mikemyzhao.FactoryPattern.FactoryPatternNormal.Products.Product;

public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
