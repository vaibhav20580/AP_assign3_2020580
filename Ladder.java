package com.company;

public class Ladder extends Floor {
    private Game g;
    private int pos;
    private int points;
    public Ladder(Game g) {
        super(g);
        this.g=g;
        this.pos = g.getPos();
        if(pos==8){
            this.points = 2;
        }
        else{
            this.points = 4;
        }
    }
    public void nextPos(){
        if(pos==8){
            g.setPos(12);
        }
        else{
            g.setPos(10);
        }
    }
    @Override
    public void changePoints(){
        g.addPoints(points);
    }
}
