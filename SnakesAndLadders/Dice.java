package SnakesAndLadders;

public class Dice {
    
    public Dice(){

    }

    public int rollDice(){
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        int diceValue = (int)(Math.random() * range) + min;
        return diceValue;
    }
}
