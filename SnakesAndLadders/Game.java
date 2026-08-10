package SnakesAndLadders;
import java.util.*;
// Future scope -> singleton
public class Game {
    private List<Player> players;
    private Board board;
    private Dice dice;
    private int turn = -1;

    public Game(Board board, Dice dice, ArrayList<Player> players){
        this.board = board;
        this.dice = dice;
        this.players = players;
    }

    public Player nextTurn(){
        turn = (turn + 1) % players.size();
        return players.get(turn);
    }

    public int rollDice(){
        return dice.rollDice();
    }

    public GameStatus makeMove(int diceValue){
        if(turn == -1) return GameStatus.INVALID_MOVE;
        Player player = players.get(turn);
        if(player.getPlayerPosition() + diceValue > 100) return GameStatus.CONTINUE;

        int newPos = board.getUpdatedPosition(diceValue, player.getPlayerPosition());
        player.setPlayerPosition(newPos);
        if(hasWon(newPos)) return GameStatus.HAS_WON;
        return GameStatus.CONTINUE;
    }

    public boolean hasWon(int position){
        return position == 100;
    }
}
