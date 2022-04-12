package nl.codecraftr.shelfhelp.domain;

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
    var mostValuable = new Book("one", Effort.VERY_LOW, Payoff.MEDIUM); // 5 + 3
    var mediumValuable = new Book("two", Effort.MEDIUM, Payoff.MEDIUM); // 3 + 3
    var leastValuable = new Book("three", Effort.HIGH, Payoff.VERY_LOW); // 2 + 1

    var expected = List.of(
        mostValuable,
        mediumValuable,
        leastValuable
    );

    var input = Set.of(
        leastValuable,
        mediumValuable,
        mostValuable
    );

    var result = ReadingOrderService.optimallyOrdered(input);

    assertThat(result).isEqualTo(expected);
  }
}
