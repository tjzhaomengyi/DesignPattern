package com.mikemyzhao.VisitorPattern.VisitorNormal;

public interface IVisitor {
    //可以访问哪些对象
    public void visit(ConcreteElement1 ce1);
    public void visit(ConcreteElement2 ce2);
}
