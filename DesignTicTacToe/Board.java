package com.DesignTicTacToe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Board {
    public static List<List<Symbol>> grid;
    Integer size;
    Symbol emptycell;
    public Board(Integer size){
        this.size=size;
        grid=new ArrayList<>();
        emptycell=new Symbol('-');
        for (int i = 0; i < size; i++) {
            grid.add(new ArrayList<Symbol>(Collections.nCopies(size, emptycell)));
        }



    }
    public Symbol getEmptycell(){
        return emptycell;
    }
    public boolean iscellEmpty(int row,int col) {
        if(row <0  || row>=size || col>=size  ){
            return false;
        }
       return grid.get(row).get(col)==emptycell;



    }
    public boolean  placeMark(int row,int col,Symbol symbol){
        if(row <0  || row>=size || col>=size  ){
            return false;
        }
        if(!iscellEmpty(row,col)){
            return false;
        }
         grid.get(row).set(col, symbol);
        return true;

    }
    public Symbol getCell(int  row,int col){
        if(row <0  || row>=size || col>=size  ){
            return emptycell;
        }
        return grid.get(row).get(col);

    }
    public  Integer getSize(){
        return size;
    }
    public void display(){
         Integer  row= grid.size();

         System.out.println("========================");
         for(int  i=0;i<row;i++){
             for(int j=0;j<row;j++){
                 System.out.print("|"+ grid.get(i).get(j)+"|"+"\t");

             }
             System.out.println();
         }
        System.out.println("========================");

    }
}
