package com.mikemyzhao.VisitorPattern.VisitorNormal;

public class ConcreteElement1 extends Element {
    @Override
    public void doSomething() {
        System.out.println("真实元素1的处理");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
