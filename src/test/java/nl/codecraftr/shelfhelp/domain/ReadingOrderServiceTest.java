package nl.codecraftr.shelfhelp.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Set;
import nl.codecraftr.shelfhelp.domain.model.Book;
import nl.codecraftr.shelfhelp.domain.model.BookRepository;
import nl.codecraftr.shelfhelp.domain.model.Effort;
import nl.codecraftr.shelfhelp.domain.model.Payoff;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ReadingOrderServiceTest {

  @Mock
  private BookRepository repo;
  @InjectMocks
  private ReadingOrderService service;

  @Test
  void shouldReturnBooksFromMostToLeastValuable() {
    var mostValuable = new Book("one", Effort.VERY_LOW, Payoff.MEDIUM); // 5 + 3
    var mediumValuable = new Book("two", Effort.MEDIUM, Payoff.MEDIUM); // 3 + 3
    var leastValuable = new Book("three", Effort.HIGH, Payoff.VERY_LOW); // 2 + 1

    when(repo.getAll()).thenReturn(Set.of(leastValuable, mediumValuable, mostValuable));

    var expected = List.of(
        mostValuable,
        mediumValuable,
        leastValuable
    );

    var result = service.optimallyOrdered();

    assertThat(result).isEqualTo(expected);
  }
}
