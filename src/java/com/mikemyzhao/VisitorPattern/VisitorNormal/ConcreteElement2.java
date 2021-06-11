package com.mikemyzhao.VisitorPattern.VisitorNormal;

public class ConcreteElement2 extends Element {
    @Override
    public void doSomething() {
        System.out.println("元素2的业务逻辑");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
