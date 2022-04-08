package nl.codecraftr.shelfhelp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookTest {
    private final Book book = new Book("Pragmatic Programmer", 4, 5);

    @Test
    public void shouldHaveTitle() {
        assertThat(book.title()).isEqualTo("Pragmatic Programmer");
    }

    @Test
    void shouldHaveEffort() {
        assertThat(book.effort()).isEqualTo(4);
    }

    @Test
    void shouldHavePayoff() {
        assertThat(book.payoff()).isEqualTo(5);
    }
}
