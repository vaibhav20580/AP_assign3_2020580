package com.company;
import java.util.Scanner;

public class Main {
    public static int roll(){
        double x = Math.random();
        int a;
        if(x>=0.5){
            a=1;
        }
        else{
            a=2;
        }
        System.out.println("Dice gave " + a);
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Enter the player name and hit enter");
        String name;
        String s;
        int dice;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("The game setup is ready");
        Game g = new Game();
        while(true){
            System.out.println("Hit enter to roll the dice");
            s = sc.nextLine();
            dice = roll();
            if(dice==2){
                System.out.println("Game cannot start until you get 1");
            }
            else{
                System.out.println("Player position Floor-0");
                System.out.println(name + " has reached an Empty Floor");
                System.out.println("Total points 1");
                break;
            }
        }
        while(g.getPos()!=13){
            System.out.println("Hit enter to roll the dice");
            s = sc.nextLine();
            dice = roll();
            if(g.getPos()==12 && dice == 2){
                System.out.println("Player cannot move");
            }
            else{
                g.setPos(g.getPos()+dice);
                if(g.getPos()==0 || g.getPos()==1 || g.getPos()==3 || g.getPos()==4 || g.getPos()==6 || g.getPos()==7 || g.getPos()==9 || g.getPos()==10 || g.getPos()==12 ||g.getPos()==13){
                    Empty f = new Empty(g);
                    f.changePoints();
                    f.display();
                }
                else if(g.getPos()==5 || g.getPos()==11){
                    Snake l = new Snake(g);
                    l.changePoints();
                    l.display();
                    l.nextPos();
                    Empty f = new Empty(g);
                    f.changePoints();
                    f.display();
                }
                else{
                    Ladder l = new Ladder(g);
                    l.changePoints();
                    l.display();
                    l.nextPos();
                    Empty f = new Empty(g);
                    f.changePoints();
                    f.display();
                }
            }
        }
        System.out.println("Game over \n"+name+" has accumulated "+g.getPoints()+" points");
    }
}
