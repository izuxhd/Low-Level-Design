package com.Adapterpattern;

import java.util.ArrayList;
import java.util.List;

public class CombinedMenu implements  IMenu{
    public List<FOODITEMS> getVegetarianItems(){
        List<FOODITEMS>vegFood=new ArrayList<>();
        vegFood.add(FOODITEMS.DAL_MAKHNI);
        vegFood.add(FOODITEMS.CHURMA);
        vegFood.add(FOODITEMS.PANEER_PASINDA);
        return   vegFood;
    }

    @Override
    public List<FOODITEMS> getNonVegetariansItems() {
        List<FOODITEMS> nonvegFood = new ArrayList<>();
        nonvegFood.add(FOODITEMS.BUTTER_CHICKEN);
        nonvegFood.add(FOODITEMS.PRAWNS);
        return nonvegFood;
    }
}
