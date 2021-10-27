package com.company;

public class Snake extends Floor{
    private Game g;
    private int pos;
    private int points;
    public Snake(Game g) {
        super(g);
        this.g=g;
        this.pos = g.getPos();
        if(pos==5){
            this.points = -2;
        }
        else{
            this.points = -4;
        }
    }
    public void nextPos(){
        if(pos==5){
            g.setPos(1);
        }
        else{
            g.setPos(3);
        }
    }
    @Override
    public void changePoints(){
        g.addPoints(points);
    }
}
