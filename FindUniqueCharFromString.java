public class FindUniqueCharFromString {
    public static void main(String[] args) {
        String s = "aavaiaoababbavvvvvvv";
        String uniquestr="";
        
        for(int i = 0; i<s.length(); i++){
            String s1 =Character.toString(s.charAt(i));
            if(!uniquestr.contains(s1)){
                uniquestr+=s1;
            }
        }
        System.out.println("Unique characters in string "+uniquestr);  
    }
}
