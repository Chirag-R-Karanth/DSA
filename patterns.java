import java.util.Scanner;

class Main
{
   // Main()
   char a[][];
    public static void main(String[] args)
    {
        //int a[][];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int len=sc.nextInt();
        int wid=sc.nextInt();
        //for(int i=0 ;i<)
        pattern.rectangle(len,wid);
    }
}

 class pattern
{
    /*pattern()
    {
        char a[][];
    }*/
    
    static int rectangle(int len, int wid)
    {
        Main patter=new Main();
        for(int j=0;j<wid;j++)
        {
            for(int i=0;i<len;i++)
            {
            //System.out.println("*");
                patter.a[len][wid]='*';
            }
        }
        for(int j=0;j<wid;j++)
        {
            for(int i=0;i<len;i++)
            {
                System.out.println(patter.a[len][wid]);
                
            }
        }
        return 0;        
    }
}