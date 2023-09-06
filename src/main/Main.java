package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.stream.Collectors;

import static main.Data.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Files.createDirectories(Path.of(PATH));

        for (int i = START_SUFFIX; i <= END_SUFFIX; i++) {
            Map<String, String> data = addSuffix(getValues(), i);
            Path file = Path.of(PATH, data.get("user"));
            Files.write(file, "".getBytes());
            Files.write(file, formatData(data).getBytes(), StandardOpenOption.APPEND);
        }
    }

    private static Map<String, String> addSuffix(Map<String, String> values, int suffix) {
        return values.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue() + suffix));
    }

    private static String formatData(Map<String, String> data) {
        return data.get(PASSWORD) + "\n" +
                data.get(FIRSTNAME) + ";" + data.get(LASTNAME) + "\n" +
                data.get(STREET) + "\n" +
                data.get(CITY) + "\n" +
                ";" + "\n";
    }
}