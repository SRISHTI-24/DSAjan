import java.util.Scanner;
public class de2 {
    public static void main(String[] args) {
        long n;
        Scanner s= new Scanner(System.in);
        n = s.nextLong();
        long a[] =new long[1000];
        long f=1,c=0;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f);
        while(f!=0)
        {
            long x = f%10;
            a[(int) c]=x;
            c++;
            f=f/10;
        }
        long d=0;
        for(long i=0;i<c;i++)
        {
            if(a[(int) i]==0)
                d++;
            else
                break;
        }
        System.out.println(d);
    }
}
