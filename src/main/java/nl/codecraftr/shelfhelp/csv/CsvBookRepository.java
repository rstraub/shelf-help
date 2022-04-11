package nl.codecraftr.shelfhelp.csv;

import java.util.Set;
import java.util.stream.Collectors;
import nl.codecraftr.shelfhelp.domain.model.Book;
import nl.codecraftr.shelfhelp.domain.model.BookRepository;

/**
 * Book repository for csv files.
 */
public class CsvBookRepository implements BookRepository {

  /**
   * Retrieve all books from csv file.
   */
  @Override
  public Set<Book> getAll() {
    return new FileLineReader()
        .lines()
        .stream()
        .filter(this::isContentRow)
        .map(CsvConverter::toBook)
        .collect(Collectors.toSet());
  }

  private Boolean isContentRow(String line) {
    final var headerRow = "Title,Effort,Payoff";
    return !line.equals(headerRow);
  }
}
