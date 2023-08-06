import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence or a paragraph:");
        String input = scanner.nextLine();
        scanner.close();

        int wordCount = countWords(input);
        System.out.println("Word Count: " + wordCount);
    }

    private static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        // Split the input string into words using regular expression
        String[] words = input.split("\\s+");

        // Filter out any empty strings resulting from multiple spaces
        int count = 0;
        for (String word : words) {
            if (!word.trim().isEmpty()) {
                count++;
            }
        }

        return count;
    }
}

    

