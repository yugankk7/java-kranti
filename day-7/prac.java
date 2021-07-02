package prac;

import java.util.Arrays;

public class Prac {

    public Integer add(Integer a, Integer b){
        return a + b;
    }
    
    public Integer add(Integer a, Integer b, Integer c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int new_arr[] = new int[arr.length];
        System.arraycopy(arr, 0, new_arr, 0, arr.length);
        // for (int i = 0; i < new_arr.length; i++) {
        //     System.out.print(new_arr[i] +  " ");
        // }
        System.out.println(Arrays.toString(new_arr));

        int final_arr[] = new int[new_arr.length - 1];
        int id = 3;
        for (int i = 0; i < final_arr.length; i++) {
            System.out.println("i is " + i + "  and val is " + new_arr[i]);
            if (i < id) {
                final_arr[i] = new_arr[i];
            }
            else {
                final_arr[i] = new_arr[i+1];
            }
            System.out.println("Now arr is " + Arrays.toString(final_arr));

        }

        // for (int i = 0; i < new_arr.length; i++) {
        //     System.out.println(new_arr[i] +  " ");
        // }
        System.out.println(Arrays.toString(final_arr));

        String s1 = "hello ";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1.charAt(2));
        System.out.println((s1+s2).substring(3));
        System.out.println(s1.compareTo(s2));


        StringBuffer sb1 = new StringBuffer("This is a string buffer");
        sb1.append(" appending");
        System.out.println(sb1.append(5));

        StringBuffer sb2 = new StringBuffer();
        sb1.toString();
        System.out.println(sb1.append("test"));
        System.out.println(sb2.append("appending in empty string buffer"));
            

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("appending into string builder"));
        sb.setCharAt(1, 'a');
        System.out.println(sb);

    }

}
