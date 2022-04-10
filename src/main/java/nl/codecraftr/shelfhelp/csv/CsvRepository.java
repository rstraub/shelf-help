package nl.codecraftr.shelfhelp.csv;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import nl.codecraftr.shelfhelp.domain.model.Book;

/**
 * Book repository for csv files.
 */
public class CsvRepository {

  /**
   * Retrieve all books from file.
   */
  public Set<Book> getAll() {

    InputStream inputStream = this.getClass().getResourceAsStream("/books.csv");
    StringBuilder resultStringBuilder = new StringBuilder();
    try (BufferedReader br
        = new BufferedReader(new InputStreamReader(inputStream))) {
      String line;
      while ((line = br.readLine()) != null) {
        resultStringBuilder.append(line).append("\n");
      }
    } catch (Exception e) {
      System.out.println("Error reading file");
    }

    System.out.println(resultStringBuilder);

    return Collections.emptySet();
  }
}
