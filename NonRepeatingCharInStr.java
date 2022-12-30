public class NonRepeatingCharInStr {
    public static void main(String[] args) {
        String str = "cidbhscehcbhi";
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println(str.charAt(i));
            }
        }
    }
}
