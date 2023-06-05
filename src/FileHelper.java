import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHelper {
    private static final String WORDS_FILE = "words.txt";
    private static final String OUTPUT_FILE = "hundred_dollar_words.txt";
    public static String[] getWords() {
        File file = new File(WORDS_FILE);
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        String[] words = new String[getLines(WORDS_FILE)];

        for (int i = 0; i < words.length - 1; i++) {
            words[i] = fileReader.nextLine();
        }

        return words;
    }
    public static void addWord(String word) {
        try {
            FileWriter fileWriter = new FileWriter(OUTPUT_FILE);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(word);
            bufferedWriter.newLine();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static int getLines(String fileName) {
        return 466548;
        /*
        File file = new File(fileName);
        Scanner fileReader;
        try {
            fileReader = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        int lines = 0;
        while (fileReader.hasNextLine()) {
            lines++;
        }
        return lines;
        */
    }
}
