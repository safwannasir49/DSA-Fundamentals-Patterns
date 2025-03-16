public class Solution {
    public static void nLetterTriangle(int n) {
        int i,j;
        char ch='A';
        for(i=n;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print(ch+" ");
                ch++;
            }
            ch='A';
            System.out.println();
        }
    }
}
