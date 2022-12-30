public class CountAllCharFromStrWithoutHashmap
{
	public static void main(String[] args) {
		String str = "aabbacccdd";
		char [] ch =str.toCharArray();
        int count =0;
        String uniStr = "";
        
        for( int i =0; i<ch.length;i++){
            for(int j =i+1; j<ch.length;j++){
                if(!uniStr.contains(String.valueOf(ch[i]))){
                    uniStr += ch[i];
                }
            }   
        }
        char[] uniChar = uniStr.toCharArray();
        
		for(int i=0; i<uniChar.length;i++){
            for(int j=0 ; j<ch.length;j++ ){
                if(uniChar[i]==ch[j]){
                    count++;
                }
            }
            System.out.println(uniChar[i] + " - " + count);
            count=0;
        }
}
}

