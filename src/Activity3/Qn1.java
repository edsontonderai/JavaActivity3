package Activity3;

import java.util.ArrayList;

public class Qn1 {
    public static void main(String [] args){
       ArrayList <String> color = new ArrayList<>();
       color.add("Black");
       color.add("Brown");
       color.add("Blue");
       color.add("Red");
       color.add("White");

       for(int i=0; i<color.size() ;i++){
           System.out.println(color.get(i));
       }

    }
}
