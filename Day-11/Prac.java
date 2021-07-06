package prac;

import java.util.*;

class Prac 
{

    public static void main(String[] args) 
    {
    ArrayList<String> arr = new ArrayList<String>();
    LinkedList<Integer> ll = new LinkedList<Integer>();
    Vector<String> vec = new Vector<String>();
    vec.add("hey");
    vec.add("I just");    
    vec.add("met you");
    Iterator<String> i = vec.iterator();
    while(i.hasNext())
    {
        System.out.println(i.next());
    }
    Stack<Object> st = new Stack<Object>();
    st.push(6);
    st.push(2.2);
    st.push("old");
    Iterator<Object> j = st.iterator();
    while(j.hasNext())
    {
        System.out.println(j.next());
    }
    System.out.println(st);
    
    PriorityQueue<Integer> q = new PriorityQueue<Integer>();
    q.add(5);
    q.add(10);
    q.add(1);
    q.add(8);
    System.out.println("the queue is " + q);
    System.out.println("top is" + q.peek());
    q.poll();
    System.out.println("now top is " + q.peek());

    SortedSet<Integer> s1 = new TreeSet<Integer>();
    s1.add(1);
    s1.add(2);
    s1.add(3);
    s1.add(1);
    s1.add(6);
    s1.add(5);
    System.out.println(s1);


    LinkedHashMap<Object, Object> map = new LinkedHashMap<Object, Object>(); 
    map.put(1, "hey");
    map.put(2, "I just");
    map.put(3, "met you");
    map.put("and this is", "crazy");
   
    System.out.println(map.get(2));
    for(Map.Entry m:map.entrySet()) {
        System.out.println(m.getKey() + " : " + m.getValue());

    }
    map.remove(2);
    for(Map.Entry m:map.entrySet()) {
        System.out.println(m.getKey() + " : " + m.getValue());
    }




}
}
