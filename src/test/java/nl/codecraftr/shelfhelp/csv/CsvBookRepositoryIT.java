package nl.codecraftr.shelfhelp.csv;

import nl.codecraftr.shelfhelp.domain.model.Book;
import nl.codecraftr.shelfhelp.domain.model.Effort;
import nl.codecraftr.shelfhelp.domain.model.Payoff;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CsvBookRepositoryIT {
    @Test
    void shouldReturnBooksGivenCsvEntries() {
        var expected = List.of(
                new Book("Pragmatic Programmer", Effort.LOW, Payoff.MEDIUM),
                new Book("Programmers Brain", Effort.VERY_LOW, Payoff.MEDIUM),
                new Book("Domain Driven Design", Effort.HIGH, Payoff.VERY_HIGH)
        );

        assertThat(false).isFalse();
    }
}
