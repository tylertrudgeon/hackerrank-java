import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
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


//        try {
//            Scanner in = new Scanner(System.in);
//            int n = in .nextInt();
//            in.close();
//            //String s=???; Complete this line below
//
//            String s = Integer.toString(n);
//
//
//            if (n == Integer.parseInt(s)) {
//                System.out.println("Good job");
//            } else {
//                System.out.println("Wrong answer.");
//            }
//        } catch (DoNotTerminate.ExitTrappedException e) {
//            System.out.println("Unsuccessful Termination!!");
//        }

//        import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//import java.time.LocalDate;
//
//        class Result {
//
//            /*
//             * Complete the 'findDay' function below.
//             *
//             * The function is expected to return a STRING.
//             * The function accepts following parameters:
//             *  1. INTEGER month
//             *  2. INTEGER day
//             *  3. INTEGER year
//             */
//
//            public static String findDay(int month, int day, int year) {
//                int m = Integer.valueOf(month);
//                int d = Integer.valueOf(day);
//                int y = Integer.valueOf(year);
//
//                LocalDate date = LocalDate.of(y, m, d);
//                return date.getDayOfWeek().toString();
//            }
//
//        }

//        import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//        public class Solution {
//
//
//            static int solveMeFirst(int a, int b) {
//                // Hint: Type return a+b; below
//                return a + b;
//            }
//
//            public static void main(String[] args) {
//                Scanner in = new Scanner(System.in);
//                int a;
//                a = in.nextInt();
//                int b;
//                b = in.nextInt();
//                int sum;
//                sum = solveMeFirst(a, b);
//                System.out.println(sum);
//            }
//        }

//        static int simpleArraySum(int[] ar) {
//        int total = 0;
//
//        for(int i = 0; i < ar.length; i++) {
//            total = total + ar[i];
//        }
//        return total;
//    }

//        // Complete the compareTriplets function below.
//        function compareTriplets(a, b) {
//        let alice = 0;
//        let bob = 0;
//
//        for(let i = 0; i < a.length; i ++) {
//            if(a[i] > b[i]) {
//                alice ++;
//            } else  if (a[i] < b[i]) {
//                bob ++;
//            }
//        }
//        return [alice, bob];
//    }

//        // Complete the aVeryBigSum function below.
//        function aVeryBigSum(ar) {
//        return ar.reduce((acc, curr) => acc + curr);
//}

//        function diagonalDifference(arr) {
//            let leftSum = 0;
//        let rightSum = 0;
//        let a = arr.length;
//        for(let i = 0; i < a; i++){
//            leftSum += arr[i][i];
//            rightSum += arr[i][a - 1 - i];
//        }
//        return (Math.abs(leftSum - rightSum));
//}

//        // Complete the plusMinus function below.
//        function plusMinus(arr) {
//            let pos = 0;
//        let neg = 0;
//        let zero = 0;
//        let length = arr.length;
//
//        arr.forEach(n => {
//        if(n > 0)
//            pos++;
//        else if(n < 0)
//            neg++;
//        else
//            zero++;
//    });
//
//        console.log( (pos / length).toFixed(6) );
//        console.log( (neg / length).toFixed(6) );
//        console.log( (zero / length).toFixed(6) );
//
//
//
//}

//        // Complete the staircase function below.
//        function staircase(n) {
//        for(let i = 1; i <= n; i++) {
//            console.log( "#".repeat(i).padStart(n) );
//        }
//}

//        // Complete the miniMaxSum function below.
//        static void miniMaxSum(int[] arr) {
//        long max;
//        long min;
//        long sum;
//
//        min = arr[0];
//        max = arr[0];
//        sum = arr[0];
//
//        for(int i = 1; i < arr.length; i++){
//            sum += arr[i];
//            if(arr[i] < min){
//                min = arr[i];
//            }
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.print( (sum - max) + " " + (sum - min));
//    }

//        // Complete the birthdayCakeCandles function below.
//        static int birthdayCakeCandles(int[] ar) {
//
//        int tallest = 0;
//        int sum = 0;
//
//        for(int i = 0; i < ar.length; i++){
//            int height = ar[i];
//
//            if(height > tallest){
//                tallest = height;
//                sum = 1;
//            } else if(height == tallest){
//                sum ++;
//            }
//        }
//        return sum;
//    }

//        /*
//         * Complete the timeConversion function below.
//         */
//        static String timeConversion(String s) {
//        if(s.substring(8, 10).equals("PM")) {
//            if(!s.substring(0, 2).equals("12")){
//                s = (Integer.parseInt(s.substring(0, 2)) + 12) + s.substring(2, 8);
//            } else {
//                s = s.substring(0, 8);
//            }
//        } else if(s.substring(0, 2).equals("12") && s.substring(8, 10).equals("AM")) {
//            s = "00" + s.substring(2, 8);
//        } else {
//            s = s.substring(0, 8);
//        }
//        return s;
//    }


//        public static List<Integer> gradingStudents(List<Integer> grades) {
//        List<Integer> list = new ArrayList<>();
//        for(int i : grades) {
//            if (i >= 38) {
//                if (i % 5 == 3) {
//                    i += 2;
//                    list.add(i);
//                } else if (i % 5 == 4) {
//                    i += 1;
//                    list.add(i);
//                } else {
//                    list.add(i);
//                }
//            } else if (i < 38){
//                list.add(i);
//            }
//        }
//        return list;
//    }

//        // Complete the countApplesAndOranges function below.
//        static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
//        int appleCount = 0;
//        int orangeCount = 0;
//
//        for(int i = 0; i < Math.max(apples.length, oranges.length); i++) {
//            appleCount += isFruitInRange(apples, i, s, t, a);
//            orangeCount += isFruitInRange(oranges, i, s, t, b);
//        }
//
//        System.out.println(appleCount);
//        System.out.println(orangeCount);
//    }
//
//        private static int isFruitInRange(int fruits[], int i, int s, int t, int treePos) {
//        return i < fruits.length && (treePos + fruits[i]) >= s && (treePos + fruits[i]) <= t ? 1 : 0;
//    }


//        // Complete the reverseArray function below.
//        function reverseArray(a) {
//        return a.reverse();
//}


//        // Complete the kangaroo function below.
//        static String kangaroo(int x1, int v1, int x2, int v2) {
//        String response = "NO";
//        boolean canCatchUp = (v2 < v1);
//        if(canCatchUp) {
//            boolean willIntersectOnLand = (x1 - x2) % (v2 - v1) == 0;
//            if(willIntersectOnLand) {
//                response = "YES";
//            }
//        }
//        return response;
//    }


//        public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int[] a = new int[n];
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
//        int[] b = new int[m];
//        for(int b_i=0; b_i < m; b_i++){
//            b[b_i] = in.nextInt();
//        }
//
//        int f = lcm(a);
//        int l = gcd(b);
//        int count = 0;
//        for(int i = f, j =2; i<=l; i=f*j,j++){
//            if(l%i==0){ count++;}
//        }
//        System.out.println(count);
//    }
//
//
//        private static int gcd(int a, int b) {
//        while (b > 0) {
//            int temp = b;
//            b = a % b; // % is remainder
//            a = temp;
//        }
//        return a;
//    }
//
//        private static int gcd(int[] input) {
//        int result = input[0];
//        for (int i = 1; i < input.length; i++) {
//            result = gcd(result, input[i]);
//        }
//        return result;
//    }
//
//        private static int lcm(int a, int b) {
//        return a * (b / gcd(a, b));
//    }
//
//        private static int lcm(int[] input) {
//        int result = input[0];
//        for (int i = 1; i < input.length; i++) {
//            result = lcm(result, input[i]);
//        }
//        return result;
//    }


//        PIZZA PROJECT FOR OLO

//        import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.net.URL;
//import java.nio.charset.Charset;
//import java.nio.charset.StandardCharsets;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//
//        public class PizzaProject {
//            private static String readAll(Reader rd) throws IOException {
//                StringBuilder sb = new StringBuilder();
//                int cp;
//                while ((cp = rd.read()) != -1) {
//                    sb.append((char) cp);
//                }
//                return sb.toString();
//            }
//
//            public static JSONArray readJsonFromUrl(String url) throws IOException, JSONException {
//                InputStream is = new URL(url).openStream();
//                try {
//                    BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
//                    String jsonText = readAll(rd);
//                    JSONArray json = new JSONArray(jsonText);
//                    return json;
//                } finally {
//                    is.close();
//                }
//            }
//
//            public static void main(String[] args) throws IOException, JSONException {
//                JSONArray json = readJsonFromUrl("https://www.olo.com/pizzas.json");
//                System.out.println(json.toString());
////        System.out.println(json.get("id"));
//            }
//        }


    }
}
