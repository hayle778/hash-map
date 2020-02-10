import com.sun.jdi.Value;

import java.util.HashMap;

public class hello {

public static void main(String[]args){

    HashMap<String, String >bull = new HashMap< String, String>();

      bull.put("hh","");

     //String.copyValueOf( "","" )

      bull.put("cat", "Meow");
      bull.put( "dog", "Woof");
      bull.put("Duck", "Quak");


      System.out.println( "The cat say "+ bull.get("cat"));
      System.out.println( "The dog say " + bull.get("dog"));
      System.out.println( "The duck say " + bull.get("Duck"));
// for inhance loop

   // String bull;
  //  for( String Value : bull);
//  System.out.println( ""+ Value );




}


}
