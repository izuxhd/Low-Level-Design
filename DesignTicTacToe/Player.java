package com.DesignTicTacToe;

public class Player {
     Integer id;
    String name;
     Symbol  symbol;
     Double score;
    public Player(Integer playerid,String playername,Symbol  playersymbol){
        this.id=playerid;
        name=playername;
        symbol=playersymbol;
        score=0d;
    }
    public String getName(){
        return name;
    }
    public Symbol getSymbol(){
        return symbol;

    }
    public Double getScore(){
        return score;
    }

    public void setScore() {
        score = score+1;
    }
}
