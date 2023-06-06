public class NthDollarWord {
    private final int value;
    private final String word;
    public NthDollarWord(String word, int value) {
        this.value = value;
        this.word = stripWord(word);
    }

    public boolean isHundredDollarWord() {
        if (word.length() < value / 26 + 1 || value < word.length()) return false;
        int value = 0;
        for (char c : word.toCharArray()) {
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
