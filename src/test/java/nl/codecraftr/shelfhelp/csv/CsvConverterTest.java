package nl.codecraftr.shelfhelp.csv;

import static org.assertj.core.api.Assertions.assertThat;

import nl.codecraftr.shelfhelp.domain.model.Book;
import nl.codecraftr.shelfhelp.domain.model.Effort;
import nl.codecraftr.shelfhelp.domain.model.Payoff;
import org.junit.jupiter.api.Test;

class CsvConverterTest {

  @Test
  void shouldConvertCsvToBookGivenValidCsv() {
    var expected = new Book("Pragmatic Programmer", Effort.LOW, Payoff.MEDIUM);

    var result = CsvConverter.toBook("Pragmatic Programmer,LOW,MEDIUM");

    assertThat(result).isEqualTo(expected);
  }
}
