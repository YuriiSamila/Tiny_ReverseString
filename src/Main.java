public class Main {
    public static void main(String[] args) {

        String word = "Football";
        char[] chars = word.toCharArray();
        char[] reverseChars = new char[chars.length];
        int j = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            reverseChars[j] = chars[i];
            j++;
        }
        String reverseWord = new String(reverseChars);
        reverseWord = reverseWord
                .substring(0, 1)
                .toUpperCase()
                + reverseWord
                .substring(1, reverseWord.length() - 1)
                + reverseWord
                .substring(reverseWord.length() - 1)
                .toLowerCase();
        System.out.println(reverseWord);
    }
}
