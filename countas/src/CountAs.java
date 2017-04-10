import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountAs {
  private String fileName;

  public int getAsNumber() {
    Path path = Paths.get(fileName);
    int count = 0;
    try {
      List<String> readLines = Files.readAllLines(path);
      for (String line : readLines) {
        for (int i = 0; i < line.length(); i++) {
          if (line.toLowerCase().charAt(i) == 'a') {
            count++;
          }
        }
      }
      return count;
    } catch (IOException e) {
      return 0;
    }
  }

  public CountAs(String fileName) {
    this.fileName = fileName;
  }
}
