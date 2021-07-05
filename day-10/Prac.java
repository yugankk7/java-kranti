package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

class Prac {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("Hey");
    arr.add("I");
    arr.add("Just");
    arr.add("Met");
    arr.add("you");
    arr.add("And");
    System.out.println(arr);
    String s = "And this is crazy";
    // ArrayList<String> words = new ArrayList<String>();
    String words[] = s.split("\\W+");
    System.out.println(Arrays.toString(words));
    arr.set(0, "Heyyyy");
    System.out.println(arr);
    ArrayList<Integer> intarr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
    Collections.sort(arr, Collections.reverseOrder());
    System.out.println((arr));
    System.out.println(intarr);
    System.out.println(intarr.size());
    System.out.println(intarr.contains(2));
    for (String s1 :arr){
      System.out.println(s1);
    }
    LinkedList<Integer> ll1 = new LinkedList<Integer>();

    }
}
