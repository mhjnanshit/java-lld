package SnakesAndLadders;

public class Player {
    private int playerNo;
    private int playerPosition;

    public Player(int playerNo, int playerPosition){
        this.playerNo = playerNo;
        this.playerPosition = playerPosition;
    }

    public int getPlayerNo(){
        return this.playerNo;
    }

    public void setPlayerPosition(int value){
        this.playerPosition = value;
    }

    public int getPlayerPosition(){
        return this.playerPosition;
    }
}
