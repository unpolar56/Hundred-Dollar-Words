import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHelper {
    private static final String WORDS_FILE = "words.txt";
    public static final String OUTPUT_FILE = "_dollar_words.txt";
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
    public static void emptyFile(int value) {
        try {
            new PrintWriter(value + OUTPUT_FILE).close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void addWord(String word, int value) {
        word += "\n";
        OutputStream os;
        try {
            os = new FileOutputStream(value + OUTPUT_FILE, true);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            os.write(word.getBytes(), 0, word.length());
            os.close();
        } catch (IOException e) {
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
