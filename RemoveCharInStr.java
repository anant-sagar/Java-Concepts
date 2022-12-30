//Remove characters from the string which is presented in second string

public class RemoveCharInStr {
    public static void main(String[] args) {
        String s1="i am prashant";
        String s2 ="a m";
        s2 = s2.replaceAll(" ", "");



        for(int i=0;i<s2.length();i++){
           // System.out.println(s2.charAt(i));
            for(int j=0;j<s1.length();j++){
                if(s1.contains(String.valueOf(s2.charAt(i)))){
                        s1=s1.replace(String.valueOf(s2.charAt(i)), "");
                }
                
            }
        }
        System.out.println(s1);
    }
}
