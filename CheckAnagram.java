public class CheckAnagram {
    public static void main(String[] args) {
        // String str1="gghh";
        // String str2="hhgg";
        // int flag =0;

        // for(int i=0;i<str1.length();i++){
        //     if(str2.contains(String.valueOf(str1.charAt(i)))){
        //         flag++;
        //     }
        // }
        // if(flag==str2.length()){
        //     System.out.println("Anagram");
        // }
        // else{
        //     System.out.println("Not Anagram");
        // }
        defMeth();
    }
    static void defMeth(){
        String s="nishak";
        String n="ishkan";
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<n.length();j++){
                if(s.charAt(i)==n.charAt(j))
                { 
                    count++;
                }
                
            }

    }
    if(count==s.length() && count==n.length()){
        System.out.println("Anagram");
    }
    else{
        System.out.println("Not Anagram");
    }
}
}
