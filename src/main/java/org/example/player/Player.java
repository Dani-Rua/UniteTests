package org.example.player;

public class Player {

    private Dice dice;
    private  int minNumberWind;

    public Player(Dice dice, int minNumberWind) {
        this.dice = dice;
        this.minNumberWind = minNumberWind;
    }

    public boolean play(){
        int diceNumber = dice.roll();
        return diceNumber > minNumberWind;
    }
}
