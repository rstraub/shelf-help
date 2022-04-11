package nl.codecraftr.shelfhelp.csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
    var csvContents = readCsvEntries();
    final var headerRow = "Title,Effort,Payoff";
    csvContents
        .stream()
        .filter(line -> !line.equals(headerRow))
        .forEach(System.out::println);

    return Collections.emptySet();
  }

  private List<String> readCsvEntries() {
    var result = new ArrayList<String>();
    var fileName = "/books.csv";

    var inputStream = this.getClass().getResourceAsStream(fileName);
    try (var br
        = new BufferedReader(new InputStreamReader(inputStream))) {
      String line;
      while ((line = br.readLine()) != null) {
        result.add(line);
      }
    } catch (Exception e) {
      System.out.println("Error reading csv file: " + e);
    } finally {
      try {
        inputStream.close();
      } catch (IOException e) {
        System.out.println("Error closing csv file: " + e);
      }
    }
    return result;
  }
}
