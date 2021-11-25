package Collections;

import java.util.*;  
public class Vector1{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Ravi");  
v.add("Raja");  
v.add("Dinesh");  
v.add("Nirmal");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  