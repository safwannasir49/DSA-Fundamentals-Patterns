public class Solution {
    public static void seeding(int n) {
        int i,j;
        for(i=n;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
