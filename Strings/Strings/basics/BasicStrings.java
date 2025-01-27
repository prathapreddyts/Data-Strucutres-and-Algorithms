package basics;

import java.util.ArrayList;
import java.util.*;

/*
* String are imutable ?
*
* Inheritance,Polymorphism,Strings,HashMap
*
* */

public class BasicStrings {

    /*
    * 0 1 2 3 4 5 6
    * P r a t h a p
    * */

    public static void main(String[] args) {
        String str= "prathap";
        firstNonRepeatedChar(str);

    }
    public static void firstNonRepeatedChar(String str) {
        //
        // prathap
        /*
         * p-1
         * r-1
         * a-2
         * t-1
         * h-1
         *
         * */

        //i=0  p-1  i=1 r=1 i=2 a=1 i=3 t =1 i=4 h=1 a
        int cnt = 0;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 01);//
            } else {
                Integer i1 = map.get(ch);
                map.put(ch, i1 + 1);
            }

        }
        System.out.println(map.toString());

    }



}
