package SnakesAndLadders;
import java.util.*;

public class Board {
    private HashMap<Integer,Integer> snakes;
    private HashMap<Integer,Integer> ladders;

    public Board(){
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();
    }

    public void addSnake(int start, int end){
        if(snakes.containsKey(start) || ladders.containsKey(start)) return;
        snakes.put(start,end);
    }

    public void addLadder(int bottom, int top){
        if(ladders.containsKey(bottom) || snakes.containsKey(bottom)) return;
        ladders.put(bottom,top);
    }

    public int getUpdatedPosition(int diceValue, int currPos){
        int newPos = currPos + diceValue;

        if(snakes.containsKey(newPos)){
            newPos = snakes.get(newPos);
        }
        else if(ladders.containsKey(newPos)){
            newPos = ladders.get(newPos);
        }
        return newPos;
    }

}
