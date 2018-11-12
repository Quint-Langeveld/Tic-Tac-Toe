package com.example.qlangeveld.tictactoe;

public class Game {

    final private int BOARD_SIZE = 3;
    private TileState[][] board;

    private Boolean playerOneTurn;
    private Boolean gameOver;

    public Game() {
        board = new TileState [BOARD_SIZE][BOARD_SIZE];
            for (int i=0; i<BOARD_SIZE; i++)
                for (int j=0; j<BOARD_SIZE; j++)
                    board [i][j] = TileState.BLANK;

        playerOneTurn = true;
        gameOver = false;
    }

    public TileState choose(int row, int column) {

        if (board[row][column] == TileState.BLANK) {
            if (playerOneTurn) {
                board[row][column] = TileState.CROSS;
                playerOneTurn = Boolean.FALSE;
                return TileState.CROSS;
            } else {
                board[row][column] = TileState.CIRCLE;
                playerOneTurn = Boolean.TRUE;
                return TileState.CIRCLE;
            }
        } else {
            return TileState.INVALID;
        }
    }

    public GameState won() {
        if ((board[0][0] == TileState.CROSS && board[0][1] == TileState.CROSS && board[0][2] == TileState.CROSS) ||
            (board[1][0] == TileState.CROSS && board[1][1] == TileState.CROSS && board[1][2] == TileState.CROSS) ||
            (board[2][0] == TileState.CROSS && board[2][1] == TileState.CROSS && board[2][2] == TileState.CROSS) ||
            (board[0][0] == TileState.CROSS && board[1][0] == TileState.CROSS && board[2][0] == TileState.CROSS) ||
            (board[0][1] == TileState.CROSS && board[2][1] == TileState.CROSS && board[2][1] == TileState.CROSS) ||
            (board[0][2] == TileState.CROSS && board[1][2] == TileState.CROSS && board[2][2] == TileState.CROSS) ||
            (board[0][0] == TileState.CROSS && board[1][1] == TileState.CROSS && board[2][2] == TileState.CROSS) ||
            (board[2][0] == TileState.CROSS && board[1][1] == TileState.CROSS && board[0][2] == TileState.CROSS) ) {
            return GameState.PLAYER_ONE;
        }

        else if ((board[0][0] == TileState.CIRCLE && board[0][1] == TileState.CIRCLE && board[0][2] == TileState.CIRCLE) ||
            (board[1][0] == TileState.CIRCLE && board[1][1] == TileState.CIRCLE && board[1][2] == TileState.CIRCLE) ||
            (board[2][0] == TileState.CIRCLE && board[2][1] == TileState.CIRCLE && board[2][2] == TileState.CIRCLE) ||
            (board[0][0] == TileState.CIRCLE && board[1][0] == TileState.CIRCLE && board[2][0] == TileState.CIRCLE) ||
            (board[0][1] == TileState.CIRCLE && board[2][1] == TileState.CIRCLE && board[2][1] == TileState.CIRCLE) ||
            (board[0][2] == TileState.CIRCLE && board[1][2] == TileState.CIRCLE && board[2][2] == TileState.CIRCLE) ||
            (board[0][0] == TileState.CIRCLE && board[1][1] == TileState.CIRCLE && board[2][2] == TileState.CIRCLE) ||
            (board[2][0] == TileState.CIRCLE && board[1][1] == TileState.CIRCLE && board[0][2] == TileState.CIRCLE) ) {
            return GameState.PLAYER_TWO;
        }

        else if ((board[0][0] == TileState.CIRCLE || board[0][0] == TileState.CROSS) &&
            (board[1][0] == TileState.CIRCLE || board[1][0] == TileState.CROSS) &&
            (board[2][0] == TileState.CIRCLE || board[2][0] == TileState.CROSS) &&
            (board[1][0] == TileState.CIRCLE || board[1][0] == TileState.CROSS) &&
            (board[1][1] == TileState.CIRCLE || board[1][1] == TileState.CROSS) &&
            (board[1][2] == TileState.CIRCLE || board[1][2] == TileState.CROSS) &&
            (board[2][0] == TileState.CIRCLE || board[2][0] == TileState.CROSS) &&
            (board[2][1] == TileState.CIRCLE || board[2][1] == TileState.CROSS) &&
            (board[2][2] == TileState.CIRCLE || board[2][2] == TileState.CROSS) ) {
            return GameState.DRAW;
        }

        else {
            return GameState.IN_PROGRESS;
        }

    }
}
