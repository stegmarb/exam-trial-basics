import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountAs {
  public static void main(String[] args) {
    readFile("afile.txt");
    readFile("not-a-file.txt");
    // Create a function that takes a filename as string parameter,
    // counts the occurances of the letter "a", and returns it as a number.
    // If the file does not exist, the function should return 0 and not break.

    // example: on the input "afile.txt" the function should return 28 - print this result
    // example: on the input "not-a-file" the function should return 0 - print this result
  }
  public static void readFile(String fileName) {
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
      System.out.println(count);
    } catch (IOException e) {
      System.out.println("0");
    }
  }
}
