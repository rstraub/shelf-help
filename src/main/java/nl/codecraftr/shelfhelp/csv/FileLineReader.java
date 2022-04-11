package nl.codecraftr.shelfhelp.csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class FileLineReader {

  public List<String> lines() {
    var result = new ArrayList<String>();
    var fileName = "/books.csv";

    var inputStream = this.getClass().getResourceAsStream(fileName);
    try (var br
        = new BufferedReader(new InputStreamReader(inputStream))) {
      String line;
      while ((line = br.readLine()) != null) {
        result.add(line);
      }
    } catch (Exception e) {
      System.out.println("Error reading csv file: " + e);
    } finally {
      try {
        inputStream.close();
      } catch (IOException e) {
        System.out.println("Error closing csv file: " + e);
      }
    }
    return result;
  }
}
