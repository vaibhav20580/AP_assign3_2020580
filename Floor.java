package com.company;

public class Floor {
    private Game g;
    private int pos;
    private String type;
    public Floor(Game g){
        this.g=g;
        this.pos = g.getPos();
        if(pos==0 || pos==1 || pos==3 || pos==4 || pos==6 || pos==7 || pos==9 || pos==10 || pos==12 || pos==13){
            type = "an Empty Floor";
        }
        if(pos==2){
            type = "an Elevator Floor";
        }
        if(pos==5){
            type = "a normal Snake Floor";
        }
        if(pos==8){
            type = "a normal Ladder Floor";
        }
        if(pos==11){
            type = "a King Cobra Floor";
        }
    }
    public void changePoints(){
    }
    public void display(){
        System.out.println("Player position Floor-" + g.getPos());
        System.out.println("Player has reached " + type);
        System.out.println("Total points " + g.getPoints());
    }
}
