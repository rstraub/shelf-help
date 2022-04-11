package nl.codecraftr.shelfhelp.csv;

import java.util.Collections;
import java.util.Set;
import nl.codecraftr.shelfhelp.domain.model.Book;

/**
 * Book repository for csv files.
 */
public class CsvRepository {

  /**
   * Retrieve all books from csv file.
   */
  public Set<Book> getAll() {
    var csvContents = new FileLineReader().lines();
    csvContents
        .stream()
        .filter(this::isContentRow)
        .forEach(System.out::println);

    return Collections.emptySet();
  }

  private Boolean isContentRow(String line) {
    final var headerRow = "Title,Effort,Payoff";
    return !line.equals(headerRow);
  }
}
