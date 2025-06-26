package com.DesignTicTacToe;

import java.util.Scanner;

public class main {
    public  static  void main(String[] args){
        System.out.println("===TIC TAC TOE GAME===");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a board size");

        Integer boardsize=sc.nextInt();
        System.out.println();
        Game game=GameFactory.createGame(GameType.STANDARD,boardsize);
        IObserver notifier=new ConsoleNotifier();
        game.addObserver(notifier);
        Player p1=new Player(23,"David",new Symbol('$'));
        Player p2=new Player(95,"Danya",new Symbol('*'));

        game.addPlayer(p1);
        game.addPlayer(p2);
        game.play();
        System.out.println("\n=== Final Scores ===");
        for (Player player : game.players) {
            System.out.println(player.getName() + " : " + player.getScore());
        }

    }
}
