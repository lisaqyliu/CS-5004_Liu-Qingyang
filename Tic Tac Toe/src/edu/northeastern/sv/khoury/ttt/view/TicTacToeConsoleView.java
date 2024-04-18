package edu.northeastern.sv.khoury.ttt.view;

import edu.northeastern.sv.khoury.ttt.controller.TicTacToeController;
import edu.northeastern.sv.khoury.ttt.model.TicTacToeModel;

/**
 * Console implementation of the TicTacToeView interface.
 */
public class TicTacToeConsoleView implements TicTacToeView {
  private TicTacToeModel model;

  @Override
  public void displayGame() {
    // Display logic here
  }

  @Override
  public void setModel(TicTacToeModel model) {
    this.model = model;
  }

  @java.lang.Override
  public void setController(TicTacToeController controller) {
    // Implementation here
  }
}