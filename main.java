import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
int sum=0;
       int number =s.nextInt();
       for(int i=0;i<number;i++)
       {
           if(prime(i))
           {
      sum+=i;
           }
       }
        System.out.println(sum);
    }
    public static boolean prime(int a)
    {
        boolean t=true;
        if(a<=1)
        {
            t=false;
        }
        for (int k=2;k<=Math.sqrt((double) a);k++)
        {
            if(a%k==0)
            {
                t=false;break;
            }
        }
        return t;
    }
}
