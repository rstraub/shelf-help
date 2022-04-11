package nl.codecraftr.shelfhelp.domain.model;

import java.util.Set;

/**
 * Collection style repo for retrieving books.
 */
public interface BookRepository {

  Set<Book> getAll();
}
