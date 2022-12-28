// input str = "abcd efgh ijkl"
//output str = "dcba hgfe lkji"

public class StringRev {
    public static void main(String[] args) {
        
        String str= "abcd efgh ijkl";
        String []arr = str.split(" ");
        String rev="";
        for(int i=arr.length-1; i >=0; i--){
            String temp = arr[i];
            //System.out.println(temp);
           for (int j=0; j < temp.length(); j++){
            rev = temp.charAt(j)+rev;
           }
           rev=" "+rev;   
        }
        System.out.println(rev);          
    }
}
