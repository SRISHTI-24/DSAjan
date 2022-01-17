import java.util.Scanner;

public class QONE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = s.nextInt();
            }
        }
        int[] a = new int[200];
        int[] b = new int[200];
        int r=0,k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]%2==0)
                {
                    a[r]=arr[i][j];
                    r++;
                }
                else
                {
                    b[k]=arr[i][j];
                    k++;
                }
            }
        }
        for(int i=0;i<r;i++)
            System.out.print(a[i]);
        System.out.println("");
        for(int i=0;i<k;i++)
            System.out.print(b[i]);

    }
}
