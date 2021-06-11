package com.mikemyzhao.StrategyPattern.SanGuoExample;

public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国开绿灯，放行");
    }
}
