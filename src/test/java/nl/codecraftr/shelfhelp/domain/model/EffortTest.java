package nl.codecraftr.shelfhelp.domain.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EffortTest {

  @Test
  void veryLowShouldYieldFivePoints() {
    assertThat(Effort.VERY_LOW.points).isEqualTo(5);
  }

  @Test
  void lowShouldYieldFourPoints() {
    assertThat(Effort.LOW.points).isEqualTo(4);
  }

  @Test
  void mediumShouldYieldThreePoints() {
    assertThat(Effort.MEDIUM.points).isEqualTo(3);
  }

  @Test
  void highShouldYieldTwoPoints() {
    assertThat(Effort.HIGH.points).isEqualTo(2);
  }

  @Test
  void veryHighShouldYieldOnePoint() {
    assertThat(Effort.VERY_HIGH.points).isEqualTo(1);
  }
}
