package nl.codecraftr.shelfhelp;

import nl.codecraftr.shelfhelp.csv.CsvBookRepository;
import nl.codecraftr.shelfhelp.domain.model.Book;

/**
 * Shelf help.
 */
public class ShelfHelp {

  /**
   * Cli runner.
   */
  public static void main(String[] args) {
    if (args.length == 0) {
      throw new IllegalArgumentException("No file path for books specified");
    }
    var path = args[0];

    new CsvBookRepository(path).getAll().stream().map(Book::title).forEach(System.out::println);
  }
}
