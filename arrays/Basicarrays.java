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
        System.out.println("printing the elements:");
        print(a);
        // traversing using while loop
        System.out.println("printing reverse of the array: ");
        printreverse(a);
        // traversing using for each loop
        System.out.println("sum of the array:");
        sum(a);
        System.out.println("max element in the array:");
        maxele(a);
        System.out.println("min element in the array:");
        minele(a);
        int find = sc.nextInt();
        System.out.println("finding the given element:");
        search(a, find);
        // shallow copying
        System.out.println("copying the elements using call by reference");
        copyarray(a);
        // deep opying
        System.out.println("copying the elements using clone method:");
        copyarr(a);
        // count the number of occurence of element
        int k = sc.nextInt();
        System.out.println("find the occurence of an element:");
        count(a, k);
        // finding the last occurence of the element
        System.out.println("finding the last occurence of the element in the array:");
        int ele = sc.nextInt();
        lastocc(a, ele);
        // count the numbers strictly greater than x
        System.out.println("counting the elements greter than x:");
        int find1 = sc.nextInt();
        countgtx(a, find1);
        // check whether given array is sorted or not
        System.out.println("checking whether given array is sorted or not:");
        checksort(a);
        System.out.println("removing the duplicate elements:");
        int n = removeduplicate(a);
        for (int x = 0; x < n; x++)
            System.out.print(a[x] + " ");
        System.out.println();
        sc.close();
    }

    public static void checksort(int a[]) {
        boolean check = false;
        for (int u = 1; u < a.length; u++) {
            if (a[u] < a[u - 1])
                check = true;
        }
        if (check)
            System.out.println("not sorted");
        else
            System.out.println("sorted");
    }

    public static void countgtx(int a[], int x) {
        int c = 0;
        for (int y = 0; y < a.length; y++) {
            if (a[y] > x) {
                c++;
            }
        }
        System.out.println(c);
    }

    public static void lastocc(int a[], int ele) {
        int temp = -1;
        for (int x = 0; x < a.length; x++) {
            if (a[x] == ele)
                temp = x;
        }
        System.out.println(temp);
    }

    public static void count(int a[], int k) {
        int co = 0;
        for (int ele : a) {
            if (ele == k)
                co++;
        }
        System.out.println(co);
    }

    public static void copyarr(int a[]) {
        int copy_arr[] = a.clone();
        print(copy_arr);
        System.out.println();
    }

    public static void copyarray(int a[]) {
        int[] arr = a;
        print(arr);
        System.out.println();
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
