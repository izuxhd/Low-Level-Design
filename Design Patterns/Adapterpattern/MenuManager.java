package com.Adapterpattern;

import java.util.List;

public class MenuManager {
    public static  void printMenu(List<FOODITEMS> foodies, String name){

        for(FOODITEMS item:foodies){

            System.out.println(name+ " has item in menu " + item);

        }


    }
    public  static void  main(String[] args){
        CombinedMenu combinedMenu=new CombinedMenu();
        vegMenuAdapater  tasteofindia=new vegMenuAdapater(combinedMenu);
        String name ="taste of India";
        printMenu(tasteofindia.getVegetarianItems(),name);
        name ="Welcome TO Punjab";
        printMenu(combinedMenu.getVegetarianItems(),name );
        printMenu(combinedMenu.getNonVegetariansItems(),name );
    }
}
