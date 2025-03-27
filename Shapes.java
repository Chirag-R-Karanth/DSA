import java.util.Scanner;

class Shapes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int len;
        int bre;
        //int choice=sc.nextInt();
        while (true) 
        {
            // Clear menu display
            System.out.println("\n--- PATTERN MENU ---");
            System.out.println("0. Exit");
            System.out.println("1. Solid Rectangle");
            System.out.println("2. Hollow Rectangle");
            System.out.println("3. Half Pyramid");
            System.out.println("4. Inverted Half Pyramid");
            System.out.println("5. Right-Aligned Pyramid");
            System.out.println("6. Inverted Right-Aligned Pyramid");
            
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            
            // Exit condition
            /*if (choice == 0) {
                System.out.println("Exiting program...");
                break;
            }*/
        //while(1)
        //{
            switch(choice)
            {
                case 0:
                {
                    System.out.println("Exiting Code......");
                    sc.close();
                    System.exit(0);
                }
                case 1:
                {
                    System.out.print("\nEnter Length: ");
                    len=sc.nextInt();
                    System.out.print("\nEnter Breadth: ");
                    bre=sc.nextInt();
                    rectangle.make(len,bre);
                    break;
                }

                case 2:
                {
                    System.out.print("\nEnter Length: ");
                    len=sc.nextInt();
                    System.out.print("\nEnter Breadth: ");
                    bre=sc.nextInt();
                    hollowrectangle.make(len,bre);
                    break;
                }

                case 3:
                {
                    System.out.print("\nEnter Length: ");
                    len=sc.nextInt();
                    halfpyramid.make(len);
                    break;
                }

                case 4:
                {
                    System.out.print("\nEnter Length: ");
                    len=sc.nextInt();
                    invhalfpyramid.make(len);
                    break;
                }

                case 5:
                {
                    System.out.print("\nEnter Length: ");
                    len=sc.nextInt();
                    invrothalfpyramid.make(len);
                    break;
                }

                case 6:
                {
                    System.out.print("\nEnter Length: ");
                    len=sc.nextInt();
                    trinum.make(len);
                    break;
                }
            }
        //}        
        //
        }
        
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

class hollowrectangle {//Check onceas I dont know
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
    static void make( int bre){
        //int count=1;
        for(int j=1; j<=bre ;j++){
            for(int l=j; l>=1 ;l--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class invhalfpyramid{
    static void make(int bre){
        //int count=1;
        for(int j=bre; j>=1 ;j--){
            for(int l=j; l>=1 ;l--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class invrothalfpyramid{
    static void make(int bre){
        for(int j=bre; j>=1 ;j--){
            for(int l=1; l<=bre ;l++){
                if(l > j-1){
                    //System.out.print(" ");
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                //if(l)
            }
            System.out.println();
        }
    }
}

class trinum{
    static void make(int bre){
        for(int j=1; j<=bre ;j++){
            for(int l=j; l>=1 ;l--){
                System.out.print(l);
            }
            System.out.println();
    }
}}