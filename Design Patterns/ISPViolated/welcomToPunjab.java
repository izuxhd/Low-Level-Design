package com.ISPViolated;

import java.util.ArrayList;
import java.util.List;

public class welcomToPunjab implements IMenu {
    public List<FOODITEMS> getVegetarianItems(){
        List<FOODITEMS>vegFood=new ArrayList<>();
        vegFood.add(FOODITEMS.DAL_MAKHNI);
        vegFood.add(FOODITEMS.CHURMA);

        return   vegFood;
    }

    @Override
    public List<FOODITEMS> getNonVegetariansItems() {
        List<FOODITEMS>nonvegFood=new ArrayList<>();
        nonvegFood.add(FOODITEMS.BUTTER_CHICKEN);
        return nonvegFood;
    }
}
