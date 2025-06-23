package com.ISPViolated;

import java.util.List;

public class MenuManager {
     public static  void printMenu(List<FOODITEMS>foodies,String name){

         for(FOODITEMS item:foodies){

             System.out.println(name+ " has item in menu " + item);

         }


     }
public static  void main(String[] args){
    TasteofIndia tasteofIndia=new TasteofIndia();
    String name="tastofindia";
   printMenu(tasteofIndia.getVegetarianItems(),name);

    printMenu(tasteofIndia.getNonVegetariansItems(),name);
    System.out.println();
    welcomToPunjab welcomToPunjab=new welcomToPunjab();
    name="welcomtoPunjab";
    printMenu(welcomToPunjab.getVegetarianItems(),name);
    System.out.println();
    printMenu(welcomToPunjab.getNonVegetariansItems(),name);



}

}
