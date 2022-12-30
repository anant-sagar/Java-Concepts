public class RepeatingCharInStr {
    public static void main(String[] args) {
        String str = "gabbbbbecdeeeaaaag";
        String nonRepetingStr = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (!nonRepetingStr.contains(String.valueOf(str.charAt(i)))) {
                        nonRepetingStr += str.charAt(i);
                    }
                }
            }
        }
        System.out.println(nonRepetingStr);
    }
}
