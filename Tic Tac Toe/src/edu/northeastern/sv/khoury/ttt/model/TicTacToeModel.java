package edu.northeastern.sv.khoury.ttt.model;

/**
 * Interface defining the model for a Tic Tac Toe game. This includes operations
 * to manage game state and query game information.
 */
public interface TicTacToeModel {
  /**
   * Attempts to place a move at the specified coordinates.
   *
   * @param row the row to place the move (0-based indexing)
   * @param col the column to place the move (0-based indexing)
   * @throws IllegalArgumentException if the specified position is out of bounds
   * @throws IllegalStateException if the move is not valid (e.g., position already taken, game over)
   */
  void move(int row, int col) throws IllegalArgumentException, IllegalStateException;

  /**
   * Returns the current player.
   *
   * @return the player who is currently allowed to make a move
   */
  Player getCurrentPlayer();

  /**
   * Retrieves the player at the specified board position.
   *
   * @param row the row index of the board position
   * @param col the column index of the board position
   * @return the player occupying the specified position or Player.NOBODY if it is empty
   * @throws IllegalArgumentException if the specified position is out of bounds
   */
  Player getPlayerAt(int row, int col) throws IllegalArgumentException;

  /**
   * Checks whether the game has ended.
   *
   * @return true if the game is over, false otherwise
   */
  boolean isGameOver();

  /**
   * Determines the winner of the game.
   *
   * @return the winning player or Player.NOBODY if there is no winner yet or if the game is a tie
   */
  Player getWinner();
}
