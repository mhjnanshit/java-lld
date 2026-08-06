package TicTacToe;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private int turn = 0;
    private boolean finished = false;

    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
    }

    public Player getPlayer1(){
        return this.player1;
    }

    public Player getPlayer2(){
        return this.player2;
    }

    public GameStatus makeMove(Player player, int row, int col){
        if(this.finished == true) return GameStatus.INVALID_MOVE;
        if(this.turn == player.getPlayerNum()) return GameStatus.INVALID_MOVE;
        this.turn = player.getPlayerNum();
        GameStatus status = board.makeMove(row, col, player.getSymbol());
        if(status == GameStatus.PLAYER_WON || status == GameStatus.TIE) this.finished = true; 
        return status;
    }

}
