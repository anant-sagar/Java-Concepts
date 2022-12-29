import java.util.*;

public class AllCharCountInStr {

    public static void main(String[] args) {
        String str = "rajadnedend";
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (Character c : ch) {
            //System.out.println(c);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> h: hm.entrySet()) {
            System.out.println(h.getKey() + "-"+h.getValue());
        }
    }
}
