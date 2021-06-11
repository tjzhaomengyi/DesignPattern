package com.mikemyzhao.BuilderPattern.CarExample.Client;

import com.mikemyzhao.BuilderPattern.CarExample.Director.Director;

public class Cient {
    public static void main(String[] args){
        Director director = new Director();

        //A类型奔驰
        for(int i=0;i<10;i++){
            director.getABenzModel().run();
        }
        //B类型奔驰
        for(int i=0;i<5;i++){
            director.getBBenzModel().run();
        }

        //C类型宝马
        for(int i=0;i<6;i++){
            director.getCBMWModel().run();
        }

        //D类型宝马
        for(int i=0;i<3;i++){
            director.getDBMWModel().run();
        }

    }

}
