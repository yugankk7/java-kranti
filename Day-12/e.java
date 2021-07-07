package BasicJavaTest;

import java.util.Scanner;

public class e {
    static boolean check(int arr[]) {
        boolean ans = false;
        int max = 0;
        int sum = 0;
        for (int i: arr) {
            if (i > max) {                                  //Going through the array to find the sum of array 
                max = i;                                    //and the maximum value in one go
            }
            sum += i;
        }
        if (max == sum-max) {                               //condition is satisfied if max is equal to the sum minus max
                                                            //which means sum of all values excluding the max value
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the values of the array : ");
        for (int i = 0;i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(check(arr));
    }
}
