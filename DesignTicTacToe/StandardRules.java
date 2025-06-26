package com.DesignTicTacToe;

import java.util.List;

public class StandardRules  implements  Rules{
    @Override
    public boolean checkWin(Board board,Symbol symbol) {
        Integer  r=board.getSize();
        //

        //rowise
        for(Integer i=0;i<r;i++){
             boolean win=true;
            for(Integer j=0;j<r;j++){
                if(board.getCell(i,j)!=symbol){
                    win=false;
                    break;


                }
            }
            if(win){return true;}
        }

        //columwise
        for(Integer j=0;j<r;j++){
            boolean win=true;
            for(Integer i=0;i<r;i++){
                if(board.getCell(i,j)!=symbol){
                    win=false;
                    break;
                }
            }
            if(win){return true;}
        }

        //check main diagonal
        boolean win=true;
        for(Integer i=0;i<r;i++){
            if(board.getCell(i,i)!=symbol){
                win=false;
               break;
            }

        }
        if(win){return true;}
        //check anti diagonal
        win=true;
        for(Integer i=0;i<r;i++){

            if(board.getCell(i,r-1-i)!=symbol){
                win=false;
                break;
            }

        }


        return win;
    }

    @Override
    public boolean isvalidMove(Board board,int r,int c) {
        return board.iscellEmpty(r,c);

    }

    @Override
    public boolean checkDraw(Board board) {
        //draw  if all cells  are   filled or  one of pkayer left match
        Integer  row=board.getSize();

        for(int  i=0;i<row;i++){
            for(int j=0;j<row;j++){
                 if(board.getCell(i,j)==board.getEmptycell()){
                     return false;

                 }
            }
        }
        return  true;

    }
}
