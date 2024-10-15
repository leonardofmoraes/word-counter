import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text:");
        String text = scanner.nextLine();

        String[] words = text.split("\\s+");

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "");
            if (!word.isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}