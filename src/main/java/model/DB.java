package model;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import io.github.cdimascio.dotenv.Dotenv;

public class DB {
  private String fileName;

  public DB() {
    Dotenv dotenv = Dotenv.load();
    this.fileName = dotenv.get("DB_FILE");
  }

  public boolean insert(String line) {
    try {
      Files.write(
          Paths.get(this.fileName),
          (line + "\n").getBytes(),
          java.nio.file.StandardOpenOption.APPEND);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public ArrayList<Map<String, String>> getAll() {
    try {
      List<String> fileLines = Files.readAllLines(Paths.get(this.fileName));
      ArrayList<Map<String, String>> parsedLines = new ArrayList<Map<String, String>>();

      for (int i = 1; i < fileLines.size(); i++) {
        String[] values = fileLines.get(i).split(",");

        parsedLines.add(Map.of(
            "type", values[0],
            "categoria", values[1],
            "valor", values[2],
            "data", values[3]));
      }

      return parsedLines;
    } catch (Exception e) {
      e.printStackTrace();
      return new ArrayList<>();
    }
  }
}
