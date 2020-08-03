import java.io.*;
import java.util.Scanner;


class Solution{
    public static void main(String []arg)
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fit in:");
                if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fit anywhere.");
            }

        }

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            System.out.printf("%-15s%03d%n", s1, x);
//        }
//        System.out.println("================================");


//        int N = scanner.nextInt();
//
//        for(int i = 1; i <= 10; i++) {
//            System.out.printf("%d x %d = %d%n", N, i, N*i);
//        }


//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int c = a;
//            for(int j=0;j<n;j++){
//                c += Math.pow(2, j)*b;
//                System.out.printf("%s ",c);
//            }
//            System.out.println();
//        }
//        in.close();

//        Scanner scan = new Scanner(System.in);
//        String a;
//        int i = 1;
//        while(scan.hasNext())
//        {
//            a = scan.nextLine();
//            System.out.println(i + " " + a);
//            i++;
//        }

    }
}
