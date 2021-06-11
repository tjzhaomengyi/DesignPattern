package com.mikemyzhao.BuilderPattern.CarExample.CarModels;

import java.util.ArrayList;

public abstract class CarModel {
    //这个参数是执行顺序
    private ArrayList<String> sequence = new ArrayList<String>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    final public void run(){
        for(int i=0; i<this.sequence.size();i++){
            String actionName = this.sequence.get(i);
            if(actionName.equalsIgnoreCase("start")){
                this.start();
            }else if(actionName.equalsIgnoreCase("stop")){
                this.stop();
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if(actionName.equalsIgnoreCase("engine boom")){
                this.engineBoom();
            }
        }
    }

    //把传递过来的值传递到类内部
    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }
}
