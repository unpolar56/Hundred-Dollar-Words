import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHelper {
    public static final String OUTPUT_FILE = "_dollar_words_in_";
    public static String[] getWords(String fileName) {
        File file = new File(fileName);
        Scanner fileReader;
        try {
            fileReader = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        String[] words = new String[getLines(fileName)];

        for (int i = 0; i < words.length - 1; i++) {
            words[i] = fileReader.nextLine();
        }

        return words;
    }
    public static void emptyFile(int value, String fileName) {
        try {
            new PrintWriter(value + OUTPUT_FILE + fileName).close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void addWord(String word, int value, String fileName) {
        word += "\n";
        OutputStream os;
        try {
            os = new FileOutputStream(value + OUTPUT_FILE + fileName, true);
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
            fileReader.nextLine();
            lines++;
        }
        return lines;
    }
}
