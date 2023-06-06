public class HundredDollarWords {
    public static void main(String[] args) {
        String[] words = FileHelper.getWords();
        int count = 0;
        for (String word : words) {
            HundredDollarWord hdw = new HundredDollarWord(word);
            if (hdw.isHundredDollarWord()) {
                FileHelper.addWord(word);
                System.out.println(word);
                count++;
            }
        }
        System.out.println(count);
    }
}
