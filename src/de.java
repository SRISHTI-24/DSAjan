import java.util.Scanner;
public class de {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int c=0,k=0;
        for(int i=0;i<n;i=i+c)
        {
            c=0;
           for(int j=0;j<n;j++)
           {
               if(a[i]==a[j])
                   c++;
           }
           if(c>=1)
           {
               b[k]=a[i];
               k++;
           }
        }
        for(int i=0;i<k;i++)
            System.out.print(b[i]+" ");
    }

}
