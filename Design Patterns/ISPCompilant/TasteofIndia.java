package com.ISPCompilant;

import java.util.ArrayList;
import java.util.List;

public class TasteofIndia implements  IEVegeterian{
    public List<FOODITEMS> getVegetarianItems(){
        List<FOODITEMS>vegFood=new ArrayList<>();
        vegFood.add(FOODITEMS.DAL_MAKHNI);
        vegFood.add(FOODITEMS.CHURMA);
        vegFood.add(FOODITEMS.PANEER_PASINDA);
        return   vegFood;
    }
}
