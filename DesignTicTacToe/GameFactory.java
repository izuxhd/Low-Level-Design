package com.DesignTicTacToe;

public class GameFactory {
    public  static Game  createGame(GameType gameType,int size) {

        Game game = new Game(size);
        if (GameType.STANDARD == gameType) {
            game.setRule(new StandardRules());
            return game;
        }

        return null;
    }

}
