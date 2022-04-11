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
        "Programmers Brain,VERY LOW,MEDIUM",
        "Domain Driven Design,HIGH,VERY HIGH"
    );

    var fileReader = new FileLineReader();
    var result = fileReader.lines();

    assertThat(result).isEqualTo(expected);
  }
}
