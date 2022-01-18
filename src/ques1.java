import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int myarr1[] = new int[n];
        int myarr2[] = new int[n];
        for(int i=0;i<n;i++)
        {
            myarr1[i] = s.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            myarr2[j] = s.nextInt();

        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(myarr2[j]>=myarr1[i])
                    c++;
            }
            if(i==n-1)
                System.out.println(c);
            else
                System.out.print(c+",");
            c=0;
        }

    }
}
