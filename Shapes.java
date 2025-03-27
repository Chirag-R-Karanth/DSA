import java.util.Scanner;

class Shapes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int bre=sc.nextInt();
        int choice=sc.nextInt();
        //while(1)
        //{
            switch(choice)
            {
                case 1:
                {
                    rectangle.make(len,bre);
                }

                case 2:
                {
                    hollowrectangle.make(len,bre);
                }

                case 3:
                {
                    halfpyramid.make(len,bre);
                }
            }
        //}        
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

class hollowrectangle {
    static void make(int len, int bre) {
        for (int l = 1; l <= len; l++) {
            for (int b = 1; b <= bre; b++) {
                // Print '#' for first and last columns
                // Print '#' for first and last rows
                if (l == 1 || l == len || b == 1 || b == bre) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*class hollowrectangle{
    static void make(int len, int bre){
        //int a[][];
        for(int l=1; l<=len; l++){
            for(int b=1; b<=bre ; b++){
                if(b == 1 || b == bre){
                    System.out.print("# ");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            if(l == 1 || l == len){
                System.out.print("# ");
            }
            System.out.println("");
        }
    }
}*/

class halfpyramid{
    static void make(int len , int bre){
        int count=1;
        for(int j=1; j<=bre ;j++){
            for(int l=j; l>=1 ;l--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}