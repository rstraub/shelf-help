package nl.codecraftr.shelfhelp.domain.model;

/**
 * Estimated payoff to complete a book.
 */
public enum Payoff {
  VERY_LOW(1),
  LOW(2),
  MEDIUM(3),
  HIGH(4),
  VERY_HIGH(5);

  final int points;

  Payoff(int points) {
    this.points = points;
  }
}
