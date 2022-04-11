package nl.codecraftr.shelfhelp.csv;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;
import nl.codecraftr.shelfhelp.domain.model.Book;
import nl.codecraftr.shelfhelp.domain.model.Effort;
import nl.codecraftr.shelfhelp.domain.model.Payoff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CsvBookRepositoryIT {

  private CsvBookRepository repository;

  @BeforeEach
  void setUp() {
    repository = new CsvBookRepository("./src/test/resources/books.csv");
  }

  @Test
  void shouldReturnBooksGivenCsvEntries() {
    var expected = Set.of(
        new Book("Pragmatic Programmer", Effort.LOW, Payoff.MEDIUM),
        new Book("Programmers Brain", Effort.VERY_LOW, Payoff.MEDIUM),
        new Book("Domain Driven Design", Effort.HIGH, Payoff.VERY_HIGH)
    );

    var result = repository.getAll();

    assertThat(result).isEqualTo(expected);
  }
}
