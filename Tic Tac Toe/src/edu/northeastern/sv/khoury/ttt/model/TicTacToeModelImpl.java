package edu.northeastern.sv.khoury.ttt.model;

/**
 * Concrete implementation of the TicTacToeModel interface.
 */
public class TicTacToeModelImpl implements TicTacToeModel {
  // Implement all methods defined in the interface
  @Override
  public void move(int row, int col) {
    // Implementation here
  }

  @Override
  public Player getCurrentPlayer() {
    // Implementation here
    return Player.X; // Placeholder return
  }

  @Override
  public Player getPlayerAt(int row, int col) {
    // Implementation here
    return Player.NOBODY; // Placeholder return
  }

  @Override
  public boolean isGameOver() {
    // Implementation here
    return false; // Placeholder return
  }

  @Override
  public Player getWinner() {
    // Implementation here
    return Player.NOBODY; // Placeholder return
  }
}