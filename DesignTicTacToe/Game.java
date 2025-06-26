package com.DesignTicTacToe;
import java.util.*;

public class Game {
   public static  Board board;
    public Deque<Player> players=new ArrayDeque<>(); ;
    public Rules rule;
    public List<IObserver>observers;
    public Boolean gameover;

 public Game(int boardsize){
     board=new Board(boardsize);
     rule=new StandardRules();
     observers = new ArrayList<>();
     gameover=false;
 }
 public  void addPlayer(Player player){
  players.addFirst(player);

 }
 public  void addObserver(IObserver observer){
  observers.add(observer);

 }

 public void setRule(Rules rule) {
  this.rule = rule;
 }

 public void notifymsg(String msg){
     for(IObserver observer:observers){
      observer.update(msg);
     }

    }
    public  void play(){
     if(players.size()<2){
      System.out.println("Need at least 2 player");
     }
     while(!gameover){
      board.display();
      Player currentplayer=players.peekFirst();
      System.out.println("Player name : "+currentplayer.getName()+" Player Symbol: "+currentplayer.getSymbol()+" Player score :"+currentplayer.getScore());

      Scanner sc=new Scanner(System.in);
         System.out.println("Enter a row  value :");
      Integer r=sc.nextInt();
         System.out.println("Enter a  column :");
      Integer c=sc.nextInt();

      if(rule.isvalidMove(board,r,c)){
       board.placeMark(r,c,currentplayer.getSymbol());
notifymsg(currentplayer.getName()+" played" +r.toString()+","+c.toString());
 if(rule.checkWin(board,currentplayer.getSymbol())){
     currentplayer.setScore();
  board.display();
  notifymsg(currentplayer.getName()+" wins !\n");

  notifymsg(currentplayer.getName()+" wins !");
  gameover=true;
 } else if (rule.checkDraw(board)) {
  board.display();
  System.out.println("It's's draw");
  notifymsg("Game Over!");
  gameover=true;

 }

 else{
     players.removeFirst();
     players.addLast(currentplayer);
 }

      }
      else{
       System.out.println("Invalid Move! Try again");

      }

     }
    }
}
