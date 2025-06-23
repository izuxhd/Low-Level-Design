package com.Adapterpattern;

import java.util.List;


public class vegMenuAdapater implements  IVegetarianMenu {
    private  final CombinedMenu adaptee;
    public  vegMenuAdapater(CombinedMenu combinedMenu){
        this.adaptee=combinedMenu;
    }
    @Override
    public List<FOODITEMS> getVegetarianItems(){
        return this.adaptee.getVegetarianItems();

    }
}
