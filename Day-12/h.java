package BasicJavaTest;

import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows...");
        int rows = sc.nextInt();
        for(int i = 1;i <= rows; i++){
            int num = i;
            for(int j = 1; j <= i; j++){
                System.out.print(num+" ");
                num = num + rows - j;
            }
        System.out.println();
        }
        sc.close();
    }
    }
