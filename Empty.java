package com.company;

public class Empty extends Floor{
    private Game g;
    private int points = 1;
    public Empty(Game g){
        super(g);
        this.g = g;
    }
    @Override
    public void changePoints(){
        g.addPoints(points);
    }
}
