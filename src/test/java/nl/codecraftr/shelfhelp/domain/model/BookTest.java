package nl.codecraftr.shelfhelp.domain.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookTest {
    private final Book book = new Book("Pragmatic Programmer", Effort.LOW, Payoff.HIGH);

    @Test
    public void shouldHaveTitle() {
        assertThat(book.title()).isEqualTo("Pragmatic Programmer");
    }

    @Test
    void shouldHaveEffort() {
        assertThat(book.effort()).isEqualTo(Effort.LOW);
    }

    @Test
    void shouldHavePayoff() {
        assertThat(book.payoff()).isEqualTo(Payoff.HIGH);
    }
}
