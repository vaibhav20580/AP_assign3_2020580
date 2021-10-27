package com.company;

public class Game {
    private int points;
    private int pos;
    public Game(){
        points = 1;
        pos = 0;
    }
    public int getPoints(){
        return this.points;
    }
    public int getPos(){
        return this.pos;
    }
    public void addPoints(int x){
        this.points = this.points + x;
    }
    public void setPos(int x){
        this.pos = x;
    }
}
