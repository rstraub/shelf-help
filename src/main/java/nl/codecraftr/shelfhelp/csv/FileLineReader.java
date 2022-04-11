package nl.codecraftr.shelfhelp.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class FileLineReader {

  private final String csvFilePath;

  public FileLineReader(String csvFilePath) {
    this.csvFilePath = csvFilePath;
  }

  public List<String> lines() {
    var result = new ArrayList<String>();
    InputStream inputStream = null;

    try {
      File csvFile = new File(csvFilePath);
      System.out.println("Attempting to read csv at: " + csvFile.getPath());

      inputStream = new FileInputStream(csvFile);
      var br = new BufferedReader(new InputStreamReader(inputStream));
      String line;
      while ((line = br.readLine()) != null) {
        result.add(line);
      }
    } catch (Exception e) {
      System.out.println("Error reading csv file: " + e);
    } finally {
      try {
        if (inputStream != null) {
          inputStream.close();
        }
      } catch (IOException e) {
        System.out.println("Error closing csv file: " + e);
      }
    }
    return result;
  }
}
