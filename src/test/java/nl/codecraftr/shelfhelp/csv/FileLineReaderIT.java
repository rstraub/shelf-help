package nl.codecraftr.shelfhelp.csv;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class FileLineReaderIT {

  @Test
  void shouldReturnListOfLinesGivenFile() {
    var expected = List.of(
        "Title,Effort,Payoff",
        "Pragmatic Programmer,LOW,MEDIUM",
        "Programmers Brain,VERY_LOW,MEDIUM",
        "Domain Driven Design,HIGH,VERY_HIGH"
    );

    var fileReader = new FileLineReader("./src/test/resources/books.csv");
    var result = fileReader.lines();

    assertThat(result).isEqualTo(expected);
  }
}
