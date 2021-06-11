package com.mikemyzhao.CompositePattern.CorpExample;

import java.util.ArrayList;

public class Client {
    //给出根节点，遍历所有节点
    public static String getTreeInfo(Branch root){
        ArrayList<Corp> subordinateList = root.getSubordinate();
        String info = "";
        for(Corp s:subordinateList){
            if(s instanceof Leaf){
                info = info + s.getInfo() +"\n";
            }else{
                info = info+s.getInfo()+"\n"+getTreeInfo((Branch)s);
            }
        }
        return info;
    }

}
