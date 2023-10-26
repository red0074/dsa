
// https://www.codingninjas.com/studio/problems/non-decreasing-array_699920?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTab=1
import java.util.Scanner;

public class Nondecreasingarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int t = 0; t < test; t++) {

            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            solution(a, n);
        }
        sc.close();
    }

    public static void solution(int a[], int n) {
        if (n == 1)
            System.out.println("true");
        int c = 0, co = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                c++;
                System.out.println(c + " " + i);
            }
            if (a[i] == a[i - 1]) {
                co++;
                System.out.println(co + " " + i);
            }
        }
        if (c == 1 || co == 1 || c == 0)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
