package com.mikemyzhao.StrategyPattern.StrategyExtend;

/**
 * 使用枚举策略
 */
public enum Calculator {
    ADD("+"){
        public int exec(int a,int b){
            return a+b;
        }
    },
    SUB("-"){
        public int exec(int a,int b){
            return a-b;
        }
    };

    String value = "";
    //定义成员值类型
    private Calculator(String _value){
        this.value = _value;
    }

    //获得枚举成员的值
    public String getValue(){
        return this.value;
    }

    //声明一个抽象函数
    public abstract int exec(int a, int b);
}
