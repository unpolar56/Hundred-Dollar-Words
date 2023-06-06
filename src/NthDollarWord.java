public class NthDollarWord {
    private int value;
    private String originalWord;
    private String strippedWord;
    public NthDollarWord(String originalWord, int value) {
        this.value = value;
        this.originalWord = originalWord;
        strippedWord = stripWord(originalWord);
    }

    public boolean isHundredDollarWord() {
        if (strippedWord.length() < value / 26 + 1 || value < strippedWord.length()) return false;
        int value = 0;
        for (char c : strippedWord.toCharArray()) {
            value += c - 96;
        }
        return value == this.value;
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
