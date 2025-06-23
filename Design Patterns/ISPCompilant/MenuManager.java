package com.ISPCompilant;

import com.ISPViolated.FOODITEMS;
import com.ISPViolated.TasteofIndia;
import com.ISPViolated.welcomToPunjab;

import java.util.List;

public class MenuManager  {
    public static  void printMenu(List<com.ISPViolated.FOODITEMS> foodies, String name){

        for(FOODITEMS item:foodies){

            System.out.println(name+ " has item in menu " + item);

        }


    }
    public static  void main(String[] args) {
        com.ISPViolated.TasteofIndia tasteofIndia=new TasteofIndia();
        String name="tastofindia";
        printMenu(tasteofIndia.getVegetarianItems(),name);


        System.out.println();
        com.ISPViolated.welcomToPunjab welcomToPunjab=new welcomToPunjab();
        name="welcomtoPunjab";
        printMenu(welcomToPunjab.getVegetarianItems(),name);
        System.out.println();
        printMenu(welcomToPunjab.getNonVegetariansItems(),name);

    }

}
