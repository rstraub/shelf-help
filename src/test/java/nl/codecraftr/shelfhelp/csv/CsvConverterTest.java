package nl.codecraftr.shelfhelp.csv;

import static org.assertj.core.api.Assertions.assertThat;

import nl.codecraftr.shelfhelp.domain.model.Book;
import nl.codecraftr.shelfhelp.domain.model.Effort;
import nl.codecraftr.shelfhelp.domain.model.Payoff;
import org.junit.jupiter.api.Test;

// TODO: test edge cases
class CsvConverterTest {

  @Test
  void shouldConvertCsvToBookGivenValidCsv() {
    var expected = new Book("Pragmatic Programmer", Effort.LOW, Payoff.MEDIUM);

    var result = CsvConverter.toBook("Pragmatic Programmer,LOW,MEDIUM");

    assertThat(result).isEqualTo(expected);
  }

  @Test
  void shouldConvertCsvToBookGivenOtherCsv() {
    var expected = new Book("Programmers Brain", Effort.VERY_LOW, Payoff.MEDIUM);

    var result = CsvConverter.toBook("Programmers Brain,VERY_LOW,MEDIUM");

    assertThat(result).isEqualTo(expected);
  }
}
