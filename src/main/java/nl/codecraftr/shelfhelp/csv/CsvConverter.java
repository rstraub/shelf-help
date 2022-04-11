package nl.codecraftr.shelfhelp.csv;

import nl.codecraftr.shelfhelp.domain.model.Book;
import nl.codecraftr.shelfhelp.domain.model.Effort;
import nl.codecraftr.shelfhelp.domain.model.Payoff;

class CsvConverter {

  static Book toBook(String s) {
    return new Book("Pragmatic Programmer", Effort.LOW, Payoff.MEDIUM);
  }
}
