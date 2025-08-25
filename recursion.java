import java.util.Scanner;

class recursion
{
    public static void loop(int n)
    {
        if(n>0)
        {
            System.out.print("#");
            loop(n-1);   
        }    
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        loop(n);
    }
} 