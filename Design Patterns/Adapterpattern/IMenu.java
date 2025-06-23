package com.Adapterpattern;

import java.util.List;

public interface IMenu {
    public List<com.Adapterpattern.FOODITEMS> getVegetarianItems();
    public List<FOODITEMS> getNonVegetariansItems();
}
