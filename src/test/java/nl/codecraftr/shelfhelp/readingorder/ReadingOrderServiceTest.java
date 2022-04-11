package nl.codecraftr.shelfhelp.readingorder;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Set;
import nl.codecraftr.shelfhelp.domain.model.Book;
import nl.codecraftr.shelfhelp.domain.model.Effort;
import nl.codecraftr.shelfhelp.domain.model.Payoff;
import org.junit.jupiter.api.Test;

class ReadingOrderServiceTest {

  @Test
  void shouldReturnBooksFromMostToLeastValuable() {
    var expected = List.of(
        new Book("Programmers Brain", Effort.VERY_LOW, Payoff.MEDIUM), // 5 + 3
        new Book("Pragmatic Programmer", Effort.LOW, Payoff.MEDIUM), // 4 + 3
        new Book("Domain Driven Design", Effort.HIGH, Payoff.VERY_LOW) // 2 + 5
    );

    var input = Set.of(
        new Book("Domain Driven Design", Effort.HIGH, Payoff.VERY_LOW),
        new Book("Pragmatic Programmer", Effort.LOW, Payoff.MEDIUM),
        new Book("Programmers Brain", Effort.VERY_LOW, Payoff.MEDIUM)
    );
    var result = input;

    assertThat(result).isEqualTo(expected);
  }
}
