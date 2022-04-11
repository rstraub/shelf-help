package nl.codecraftr.shelfhelp.csv;

import java.util.Set;
import java.util.stream.Collectors;
import nl.codecraftr.shelfhelp.domain.model.Book;
import nl.codecraftr.shelfhelp.domain.model.BookRepository;

/**
 * Book repository for csv files.
 */
public class CsvBookRepository implements BookRepository {

  private final String csvFilePath;

  public CsvBookRepository(String csvFilePath) {
    this.csvFilePath = csvFilePath;
  }

  /**
   * Retrieve all books from csv file.
   */
  @Override
  public Set<Book> getAll() {
    return new FileLineReader(csvFilePath)
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
