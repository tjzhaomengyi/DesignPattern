package com.mikemyzhao.BuilderPattern.CarExample.CarBuilders;

import com.mikemyzhao.BuilderPattern.CarExample.CarModels.BenzModel;
import com.mikemyzhao.BuilderPattern.CarExample.CarModels.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
