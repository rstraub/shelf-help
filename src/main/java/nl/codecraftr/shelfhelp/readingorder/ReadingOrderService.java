package nl.codecraftr.shelfhelp.readingorder;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import nl.codecraftr.shelfhelp.domain.model.Book;

/**
 * Service to determine reading order of books.
 */
public class ReadingOrderService {

  /**
   * Sorts books by their optimal reading order: most to least valuable.
   */
  public static List<Book> optimallyOrdered(Set<Book> books) {
    return books
        .stream()
        .sorted(Comparator.comparingInt(Book::calculateScore).reversed())
        .collect(Collectors.toList());
  }
}
