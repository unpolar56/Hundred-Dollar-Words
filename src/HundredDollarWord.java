public class HundredDollarWord {
    private String originalWord;
    private String strippedWord;
    public HundredDollarWord(String originalWord) {
        this.originalWord = originalWord;
        strippedWord = stripWord(originalWord);
    }

    public boolean isHundredDollarWord() {
        if (strippedWord.length() < 4 || 100 < strippedWord.length()) return false;
        int value = 0;
        for (char c : strippedWord.toCharArray()) {
            value += c - 96;
        }
        return value == 100;
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
