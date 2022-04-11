package nl.codecraftr.shelfhelp;

import nl.codecraftr.shelfhelp.csv.CsvBookRepository;

/**
 * Shelf help.
 */
public class App {

  /**
   * Cli runner.
   */
  public static void main(String[] args) {
    if (args.length == 0) {
      throw new IllegalArgumentException("No file path for books specified");
    }
    var path = args[0];

    new CsvBookRepository(path).getAll().forEach(System.out::println);
  }
}
