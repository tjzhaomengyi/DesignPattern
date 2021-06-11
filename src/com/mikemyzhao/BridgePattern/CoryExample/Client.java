package com.mikemyzhao.BridgePattern.CoryExample;

public class Client {
    public static void main(String[] args){
        House house = new House();
        System.out.println("狗逼房地产公司骗人");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        System.out.println("脑残山寨公司");
        ShanZhaiCorp shanzhai = new ShanZhaiCorp(new IPod());
        shanzhai.makeMoney();
    }
}
