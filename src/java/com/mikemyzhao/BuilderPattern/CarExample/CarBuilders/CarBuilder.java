package com.mikemyzhao.BuilderPattern.CarExample.CarBuilders;

import com.mikemyzhao.BuilderPattern.CarExample.CarModels.CarModel;

import java.util.ArrayList;

public abstract class CarBuilder {
    //建造一个模型，给一个顺序，进行组装
    public abstract void setSequence(ArrayList<String> sequence);
    //设置完毕后，可以直接拿到车辆模型
    public abstract CarModel getCarModel();
}

