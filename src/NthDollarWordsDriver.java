public class NthDollarWordsDriver {
    public static void main(String[] args) {
        String[] words = FileHelper.getWords();
        int count = 0;
        for (String word : words) {
            NthDollarWord hdw = new NthDollarWord(word);
            if (hdw.isHundredDollarWord()) {
                FileHelper.addWord(word);
                System.out.println(word);
                count++;
            }
        }
        System.out.println(count);
    }
}
