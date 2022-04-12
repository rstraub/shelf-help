package nl.codecraftr.shelfhelp.csv;

import nl.codecraftr.shelfhelp.domain.model.Book;
import nl.codecraftr.shelfhelp.domain.model.Effort;
import nl.codecraftr.shelfhelp.domain.model.Payoff;

class CsvConverter {

  private static final String SEPARATOR = ",";

  static Book toBook(String csvEntry) {
    var splits = csvEntry.split(SEPARATOR);
    var title = splits[0];
    var effort = toEffort(splits[1]);
    var payoff = toPayoff(splits[2]);
    return new Book(title, effort, payoff);
  }

  private static Effort toEffort(String effort) {
    return switch (effort) {
      case "VL" -> Effort.VERY_LOW;
      case "L" -> Effort.LOW;
      case "M" -> Effort.MEDIUM;
      case "H" -> Effort.HIGH;
      case "VH" -> Effort.VERY_HIGH;
      default -> Effort.valueOf(effort);
    };
  }

  private static Payoff toPayoff(String payoff) {
    return switch (payoff) {
      case "VL" -> Payoff.VERY_LOW;
      case "L" -> Payoff.LOW;
      case "M" -> Payoff.MEDIUM;
      case "H" -> Payoff.HIGH;
      case "VH" -> Payoff.VERY_HIGH;
      default -> Payoff.valueOf(payoff);
    };
  }
}
