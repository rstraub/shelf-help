package nl.codecraftr.shelfhelp.domain;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import nl.codecraftr.shelfhelp.domain.model.Book;
import nl.codecraftr.shelfhelp.domain.model.BookRepository;

/**
 * Service to determine reading order of books.
 */
public class ReadingOrderService {

  private final BookRepository repo;

  public ReadingOrderService(BookRepository repo) {
    this.repo = repo;
  }

  /**
   * Sorts books by their optimal reading order: most to least valuable.
   */
  public List<Book> optimallyOrdered() {
    return repo.getAll()
        .stream()
        .sorted(Comparator.comparingInt(Book::calculateScore).reversed())
        .collect(Collectors.toList());
  }
}
