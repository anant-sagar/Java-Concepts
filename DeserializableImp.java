// The reverse operation of serialization is called deserialization 
// where byte-stream is converted into an object. The serialization and deserialization process 
// is platform-independent, it means you can serialize an object on one platform and deserialize 
// it on a different platform.

import java.io.*;  
class DeserializableImp{  
 public static void main(String args[]){  
  try{  
  //Creating stream to read the object  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  Student s=(Student)in.readObject();  
  //printing the data of the serialized object  
  System.out.println(s.id+" "+s.name);  
  //closing the stream  
  in.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}  