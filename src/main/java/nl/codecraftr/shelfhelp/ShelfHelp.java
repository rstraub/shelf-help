package nl.codecraftr.shelfhelp;

import nl.codecraftr.shelfhelp.csv.CsvBookRepository;
import nl.codecraftr.shelfhelp.domain.ReadingOrderService;

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

    // TODO application service for combining retrieving books and sorting
    new ReadingOrderService(new CsvBookRepository(path))
        .optimallyOrdered()
        .stream().map(b -> "%s (score %s)".formatted(b.title(), b.calculateScore()))
        .forEach(System.out::println);
  }
}
