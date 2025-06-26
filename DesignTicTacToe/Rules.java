package com.DesignTicTacToe;

import java.util.List;

public interface Rules {
    public  boolean isvalidMove(Board board,int r,int c);
    public boolean  checkWin(Board board,Symbol symbol);

    public  boolean checkDraw(Board currentboard);

}
