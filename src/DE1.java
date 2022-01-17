import java.util.Scanner;

public class DE1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f);
        int c=0;
        while(f!=0)
        {
            int a = f%10;
            if(a==0)
            {
                c++;
            }
            else
            {
                break;
            }
            f=f/10;
        }
        System.out.println(c);

    }
}
