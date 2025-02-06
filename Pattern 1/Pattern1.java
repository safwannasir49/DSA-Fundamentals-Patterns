import java.util.Scanner;
public class Solution {
    public static void nForest(int n) {
        // Write your code here
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        n =sc.nextInt();
        nForest(n);
    }
}
