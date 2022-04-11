package nl.codecraftr.shelfhelp;

import nl.codecraftr.shelfhelp.csv.CsvBookRepository;

/**
 * Hello world.
 */
public class App {

  public static void main(String[] args) {
    new CsvBookRepository().getAll().forEach(System.out::println);
  }
}
