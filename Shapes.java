import java.util.Scanner;

class Shapes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int bre=sc.nextInt();
        rectangle.make(len,bre);
        sc.close();
    }
}

class rectangle
{
    static void make(int len, int bre)
    {
        for(int j=0 ; j<bre ;j++)
        {
            for(int i=0; i<len ; i++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}