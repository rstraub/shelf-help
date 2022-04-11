package nl.codecraftr.shelfhelp.domain.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

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

  @Nested
  class ScoreTest {

    @Test
    void shouldReturnHighestScoreGivenLowEffortHighPayoff() {
      var book = new Book("Awesome", Effort.VERY_LOW, Payoff.VERY_HIGH);

      assertThat(book.calculateScore()).isEqualTo(10);
    }

    @Test
    void shouldReturnLowestScoreGivenHighEffortLowPayoff() {
      var book = new Book("Too bad", Effort.VERY_HIGH, Payoff.VERY_LOW);

      assertThat(book.calculateScore()).isEqualTo(2);
    }
  }
}
