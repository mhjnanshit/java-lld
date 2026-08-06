package TicTacToe;

public class Player {
    private int playerNum;
    private char symbol;

    public Player(int playerNum, char symbol){
        this.playerNum = playerNum;
        this.symbol = symbol;
    }

    public int getPlayerNum(){
        return this.playerNum;
    }

    public char getSymbol(){
        return this.symbol;
    }
}
