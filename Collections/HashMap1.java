package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class HashMap1 {
 public static void main(String[] args)
 {
     HashMap<String, Integer> map1 = new HashMap<>();
     map1.put("Dinesh", 10);
     map1.put("Ravi", 30);
     map1.put("Raja", 25);
     System.out.println("Size of map is: "
                        + map1.size());
     System.out.println(map1);
     if (map1.containsKey("Dinesh")) {// the statement check this key in the entry 
         Integer a = map1.get("Dinesh");
         System.out.println("value for key"
                            + " \"Dinesh\" is: " + a);
     }
     HashMap<String, Integer> map2 = new HashMap<>();
     map2.putAll(map1);//put all deatails to set another object
     System.out.println(map2);
     System.out.println(map2.get("Ravi"));// get the key value
     System.out.println(map2.containsValue(30));//the statement check this value in the entry
     System.out.println(map2.remove("Raja"));// removed the key entry  return value 
     System.out.println(map2);
     System.out.println(map2.remove("Ravi",30));//removed the entry return boolean
     System.out.println(map2.size());// return the size of object
     System.out.println(map2.isEmpty());//check empty return boolean
     map2.clear();//clear all
     System.out.println(map1.replace("Ravi", 30, 35));//replace the key value
     System.out.println(map1);
     Set so = map1.entrySet();
     Collection v = map1.values();
     System.out.println(so);System.out.println(v);
     System.out.println(map1.keySet());
     
     
 }
}
