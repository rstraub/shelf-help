package nl.codecraftr.shelfhelp.domain.model;

/**
 * Estimated effort of reading a book. The easier it is to read, the higher the points.
 */
public enum Effort {
  VERY_LOW(5),
  LOW(4),
  MEDIUM(3),
  HIGH(2),
  VERY_HIGH(1);

  final int points;

  Effort(int points) {
    this.points = points;
  }
}
