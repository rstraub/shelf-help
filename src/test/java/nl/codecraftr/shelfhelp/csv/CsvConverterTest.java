package nl.codecraftr.shelfhelp.csv;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;
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

  @Test
  void shouldConvertCsvToBookGivenOtherCsv() {
    var expected = new Book("Programmers Brain", Effort.VERY_LOW, Payoff.MEDIUM);

    var result = CsvConverter.toBook("Programmers Brain,VERY_LOW,MEDIUM");

    assertThat(result).isEqualTo(expected);
  }

  @Test
  void shouldConvertEffortShortHandsToEffort() {
    var shorthands = List.of(
        "VL",
        "L",
        "M",
        "H",
        "VH"
    );

    var expected = List.of(
        Effort.VERY_LOW,
        Effort.LOW,
        Effort.MEDIUM,
        Effort.HIGH,
        Effort.VERY_HIGH
    );

    var result = shorthands
        .stream()
        .map("book,%s,MEDIUM"::formatted)
        .map(CsvConverter::toBook)
        .map(Book::effort)
        .collect(Collectors.toList());

    assertThat(result).isEqualTo(expected);
  }

  @Test
  void shouldConvertPayoffShortHandsToPayoff() {
    var shorthands = List.of(
        "VL",
        "L",
        "M",
        "H",
        "VH"
    );

    var expected = List.of(
        Payoff.VERY_LOW,
        Payoff.LOW,
        Payoff.MEDIUM,
        Payoff.HIGH,
        Payoff.VERY_HIGH
    );

    var result = shorthands
        .stream()
        .map("book,MEDIUM,%s"::formatted)
        .map(CsvConverter::toBook)
        .map(Book::payoff)
        .collect(Collectors.toList());

    assertThat(result).isEqualTo(expected);
  }
}
