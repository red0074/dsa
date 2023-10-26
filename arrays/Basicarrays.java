package dsa.arrays;

import java.util.*;

public class Basicarrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // declaration and initialization of array
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        // traversing using for loop
        print(a);
        // traversing using while loop
        printreverse(a);
        // traversing using for each loop
        sum(a);
        maxele(a);
        minele(a);
        int find = sc.nextInt();
        search(a, find);
        int n = removeduplicate(a);
        for (int x = 0; x < n; x++)
            System.out.print(a[x] + " ");
        System.out.println();
        copyarray(a);
        sc.close();
    }

    public static void copyarray(int a[]) {
        int[] arr = a;
        print(arr);
    }

    public static int removeduplicate(int a[]) {
        int n = a.length;
        int temp[] = new int[a.length];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1])
                temp[j++] = a[i];
        }
        temp[j++] = a[n - 1];
        for (int i = 0; i < j; i++)
            a[i] = temp[i];

        return j;
    }

    public static void search(int a[], int find) {
        int flag = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == find)
                flag = i;
        }
        if (flag != 0)
            System.out.println(flag);
        else
            System.out.println("-1");

    }

    public static void minele(int a[]) {
        int min = Integer.MAX_VALUE;
        for (int ele : a) {
            if (min > ele)
                min = ele;
        }
        System.out.println(min);
    }

    public static void maxele(int a[]) {
        int max = Integer.MIN_VALUE;
        for (int ele : a) {
            if (max < ele)
                max = ele;
        }
        System.out.println(max);
    }

    public static void sum(int a[]) {
        int sum = 0;
        for (int ele : a) {
            sum += ele;
        }
        System.out.println(sum);
    }

    public static void print(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void printreverse(int a[]) {
        int n = a.length;
        int i = n;
        while (i-- > 0) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
