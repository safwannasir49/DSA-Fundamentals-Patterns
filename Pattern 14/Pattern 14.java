public class Solution {
    public static void nLetterTriangle(int n) {
        int i,j;
        char ch = 'A';
        for(i= 1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            ch = 'A';
            System.out.println();
        }
    }
}
