package com.mikemyzhao.VisitorPattern.VisitorNormal;

/**
 * 访问者
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(ConcreteElement1 ce1) {
        ce1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 ce2) {
        ce2.doSomething();
    }
}
