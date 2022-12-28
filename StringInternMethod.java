// We know that creating an object is a costly operation in Java. Therefore, to save time, 
// Java developers came up with the concept of String Constant Pool (SCP). 
// The SCP is an area inside the heap memory. It contains the unique strings. 
// In order to put the strings in the string pool, one needs to call the intern() method. 
// Before creating an object in the string pool, the JVM checks whether the string is already present 
// in the pool or not. If the string is present, its reference is returned.

public class StringInternMethod {
    public static void main(String[] args) {
        String s="Prashant";
        String str = new String("Prashant");         
        System.out.println(s==str);

        String ss="Prashant";
        String sstr = new String("Prashant").intern(); 
        System.out.println(ss==sstr);
        System.out.println(ss==s);
        System.out.println(s==sstr);
        
    }  
}
