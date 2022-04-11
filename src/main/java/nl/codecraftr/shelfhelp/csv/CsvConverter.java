package nl.codecraftr.shelfhelp.csv;

import nl.codecraftr.shelfhelp.domain.model.Book;
import nl.codecraftr.shelfhelp.domain.model.Effort;
import nl.codecraftr.shelfhelp.domain.model.Payoff;

class CsvConverter {

  private static final String SEPARATOR = ",";

  static Book toBook(String s) {
    var splits = s.split(SEPARATOR);
    var title = splits[0];
    var effort = Effort.valueOf(splits[1]);
    var payoff = Payoff.valueOf(splits[2]);
    return new Book(title, effort, payoff);
  }
}
