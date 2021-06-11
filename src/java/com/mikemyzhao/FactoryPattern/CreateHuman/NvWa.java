package com.mikemyzhao.FactoryPattern.CreateHuman;


import com.mikemyzhao.FactoryPattern.CreateHuman.Factory.AbstractHumanFactory;
import com.mikemyzhao.FactoryPattern.CreateHuman.Factory.HumanFactory;
import com.mikemyzhao.FactoryPattern.CreateHuman.Human.BlackHuman;
import com.mikemyzhao.FactoryPattern.CreateHuman.Human.Human;
import com.mikemyzhao.FactoryPattern.CreateHuman.Human.WhiteHuman;
import com.mikemyzhao.FactoryPattern.CreateHuman.Human.YellowHuman;

public class NvWa {
    public static void main(String[] args){
        //声明八卦炉
        AbstractHumanFactory yingyanglu = new HumanFactory();
        //女娲第一次造人
        System.out.println("----造出白色人种");
        Human whiteHuman = yingyanglu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("----造出黑人");
        Human blackHuman = yingyanglu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("---造出黄人");
        Human yellowHuman = yingyanglu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
