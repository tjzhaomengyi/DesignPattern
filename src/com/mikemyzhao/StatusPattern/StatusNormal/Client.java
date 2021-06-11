package com.mikemyzhao.StatusPattern.StatusNormal;
import com.mikemyzhao.StatusPattern.StatusNormal.
public class Client {
    public static void main(String[] args){
        com.mikemyzhao.StatusPattern.StatusNormal.Context context = new Context();
        context.setCurrentState(new ConcreteState1());
        context.handle1();
        context.handle2();
    }
}
