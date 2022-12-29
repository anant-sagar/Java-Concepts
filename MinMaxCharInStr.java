// Max occur and min char occure program


import java.util.HashMap;
import java.util.Map;
public class MinMaxCharInStr {
    public static void main(String[] args) {
        minMaxHasmap();
    }
// Finding Min and max occoured character from string using ASCI

    static void minMaxASII(){
        String str = "my name is prashant";
        int[] arr = new int[127];
        int max=arr[0];
        int min=1;
        char maxChar = ' ';
        char minChar = ' ';

        for(int i=0; i<str.length();i++){
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }

        for(int j=0; j<str.length();j++){
            if( max<arr[j]){
                max =str.charAt(j);
                maxChar =str.charAt(j);
            }
            if( arr[j]!=0 && min>arr[j]){
                min =str.charAt(j);
                minChar =str.charAt(j);
            }
        }
        System.out.println("max occur character from string- "+maxChar);
        System.out.println("min occur character from string- "+minChar);
    }

// Finding Min and max occoured character from string using Hasmap
    static void minMaxHasmap(){
        String str = "raarrrgggggrt";
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
        int max =0;
        char maxChar=' ';
        int min = hm.entrySet().iterator().next().getValue();
        char minChar=' ';
        //System.out.println(min);
        for (Map.Entry<Character, Integer> h: hm.entrySet()) {
            if(max<h.getValue()){
                max=h.getValue();
                maxChar=h.getKey();
            }
            if(min>h.getValue()){
                min=h.getValue();
                minChar=h.getKey();
            }
                       
        }
        System.out.println(maxChar+" is maximum occured character in "+str+", "+max+" times.");
        System.out.println(minChar+" is minimum occured character in "+str+", "+min+" times.");
    }
}
