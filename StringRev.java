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
            int k=temp.length()-1;
            //System.out.println(temp.charAt(j));
            rev = temp.charAt(j)+rev;
            if(j==k){
                rev="  "+rev;
            }
           }    
        }
        System.out.println(rev);  
             
    }
    
}
