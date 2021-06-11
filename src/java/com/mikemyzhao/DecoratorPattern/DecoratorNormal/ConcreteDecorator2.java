package com.mikemyzhao.DecoratorPattern.DecoratorNormal;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component _component) {
        super(_component);
    }

    private void method2(){
        System.out.println("装饰者2的method2方法");
    }

    @Override
    public void operate(){
        super.operate();
        method2();
    }
}
