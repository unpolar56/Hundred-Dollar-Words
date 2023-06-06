public class HundredDollarWord {
    private static final int WORD_VALUE = 305;
    private String originalWord;
    private String strippedWord;
    public HundredDollarWord(String originalWord) {
        this.originalWord = originalWord;
        strippedWord = stripWord(originalWord);
    }

    public boolean isHundredDollarWord() {
        if (strippedWord.length() < WORD_VALUE / 26 + 1 || WORD_VALUE < strippedWord.length()) return false;
        int value = 0;
        for (char c : strippedWord.toCharArray()) {
            value += c - 96;
        }
        return value == WORD_VALUE;
    }

    private static String stripWord(String word) {
        StringBuilder sb = new StringBuilder();
        if (word == null) return "";
        for (char c : word.toLowerCase().toCharArray()) {
            if (Character.isLetter(c))
                sb.append(c);
        }
        return sb.toString();
    }
}
