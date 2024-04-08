/**
 * Interface for the Tic Tac Toe game model.
 */
public interface TicTacToeModel {

  /**
   * Attempts to place a move for the current player at the specified row and column.
   *
   * @param row the row to place the move (0-based indexing)
   * @param col the column to place the move (0-based indexing)
   * @throws IllegalArgumentException if the row or col are out of bounds
   * @throws IllegalStateException if the move is not valid due to the position being occupied or the game being over
   */
  void move(int row, int col) throws IllegalArgumentException, IllegalStateException;

  /**
   * Returns the current player whose turn it is to move.
   *
   * @return the current player (X or O)
   */
  Player getCurrentPlayer();

  /**
   * Returns the player occupying a specific board position, or NOBODY if the position is empty.
   *
   * @param row the row of the position to query (0-based indexing)
   * @param col the column of the position to query (0-based indexing)
   * @return the player at the specified position or NOBODY if empty
   * @throws IllegalArgumentException if the row or col are out of bounds
   */
  Player getPlayerAt(int row, int col) throws IllegalArgumentException;

  /**
   * Determines if the game is over.
   *
   * @return true if the game has concluded, either through a win or a tie; false otherwise
   */
  boolean isGameOver();


  /**
   * Returns the winner of the game.
   *
   * @return the player who has won the game, NOBODY in case of a tie, or null if the game is not yet over
   */
  Player getWinner();
}
