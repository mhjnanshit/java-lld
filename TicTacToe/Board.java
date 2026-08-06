package TicTacToe;
import java.util.*;

public class Board {
    private ArrayList<ArrayList<Character>> board = new ArrayList<>();
    
    public Board(){
        for (int i = 0; i < 3; i++) {
            ArrayList<Character> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(' ');
            }
            board.add(row);
        }
    }

    public boolean isValid(int row, int col){
        if(row < 0 || row > 2 || col < 0 || col > 2) return false;
        return true;
    }

    public GameStatus makeMove(int row, int col, char c){
        if(!isValid(row,col)) return GameStatus.INVALID_MOVE;
        board.get(row).add(col,c);
        return isConcluded();
    }

    public GameStatus isConcluded(){
        for (int i = 0; i < 3; i++) {
            char c = board.get(i).get(0);
            if (c != ' ' &&
                c == board.get(i).get(1) &&
                c == board.get(i).get(2)) {
                return GameStatus.PLAYER_WON;
            }
        }

        for (int j = 0; j < 3; j++) {
            char c = board.get(0).get(j);
            if (c != ' ' &&
                c == board.get(1).get(j) &&
                c == board.get(2).get(j)) {
                return GameStatus.PLAYER_WON;
            }
        }

        char c = board.get(0).get(0);
        if (c != ' ' &&
            c == board.get(1).get(1) &&
            c == board.get(2).get(2)) {
            return GameStatus.PLAYER_WON;
        }

        c = board.get(0).get(2);
        if (c != ' ' &&
            c == board.get(1).get(1) &&
            c == board.get(2).get(0)) {
            return GameStatus.PLAYER_WON;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board.get(i).get(j) == ' ') {
                    return GameStatus.CONTINUE;
                }
            }
        }

        return GameStatus.TIE;
    }

}
