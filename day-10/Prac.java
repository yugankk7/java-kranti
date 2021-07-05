package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

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
    ll1.add(1);
    ll1.add(2);
    ll1.add(3);
    System.out.println(ll1);


    System.out.println("=========\nWORKING WITH QUEUE");
    PriorityQueue<Integer> q = new PriorityQueue<Integer>();
    q.add(5);
    q.add(4);
    q.add(3);
    System.out.println(q.peek());
    q.poll();
    System.out.println(q.peek());

    Stack<Integer> stac = new Stack<Integer>();
    stac.push(1);
    stac.push(2);
    stac.push(3);
    System.out.println(stac);
    System.out.println(stac.peek());
    stac.pop();
    System.out.println(stac.peek());




    }
}
