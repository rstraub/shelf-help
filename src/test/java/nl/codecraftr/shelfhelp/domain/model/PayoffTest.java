package nl.codecraftr.shelfhelp.domain.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PayoffTest {

  @Test
  void veryLowShouldYieldOnePoint() {
    assertThat(Payoff.VERY_LOW.points).isEqualTo(1);
  }

  @Test
  void lowShouldYieldTwoPoints() {
    assertThat(Payoff.LOW.points).isEqualTo(2);
  }

  @Test
  void mediumShouldYieldThreePoints() {
    assertThat(Payoff.MEDIUM.points).isEqualTo(3);
  }

  @Test
  void highShouldYieldFourPoints() {
    assertThat(Payoff.HIGH.points).isEqualTo(4);
  }

  @Test
  void veryHighShouldYieldFivePoints() {
    assertThat(Payoff.VERY_HIGH.points).isEqualTo(5);
  }
}
