
import javax.swing.tree.TreeNode;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.Scanner;
//
//
//class Solution{
//    public static void main(String []arg)
//    {
//
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for(int i = 0; i < t; i++)
//        {
//
//            try
//            {
//                long x=sc.nextLong();
//                System.out.println(x+" can be fit in:");
//                if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
//                    System.out.println("* byte");
//                }
//                if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
//                    System.out.println("* short");
//                }
//                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
//                    System.out.println("* int");
//                }
//                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
//                    System.out.println("* long");
//                }
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fit anywhere.");
//            }
//
//        }
//
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

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


//          JAVASCRIPT BETWEEN TWO SETS SOLUTION
//        function getTotalX(a, b) {
//        let validCount = 0;
//
//        for (let x = 1; x <= 100; x++) {
//            if (a.every(int => (x % int == 0))) {
//                if (b.every(int => (int % x == 0))) {
//                    validCount++;
//                }
//            }
//        }
//
//        return validCount;
//    }


//        // Complete the breakingRecords function below.
//        static int[] breakingRecords(int[] scores) {
//        int highest;
//        int lowest;
//        highest = scores[0];
//        lowest = scores[0];
//        int[] total = new int[2];
//
//        for(int i = 1; i < scores.length; i++) {
//            if(scores[i] > highest) {
//                highest = scores[i];
//                ++total[0];
//            } else if (scores[i] < lowest) {
//                lowest = scores[i];
//                ++total[1];
//            }
//        }
//        return total;
//    }


//        // Complete the birthday function below.
//        static int birthday(List<Integer> s, int d, int m) {
//        int length = s.size();
//        int numWays = 0, sum = 0;
//
//        for(int i = 0 ; i <= (length - m) ; i++){
//            for(int j = 0 ; j < m ; j++){
//                sum = sum + s.get(j+i);
//            }
//            if(sum == d){
//                numWays++;
//            }
//            sum = 0;
//        }
//        return numWays;
//
//    }

//        // Complete the divisibleSumPairs function below.
//        static int divisibleSumPairs(int n, int k, int[] ar) {
//        int count=0;
//        for(int i=0; i < n; i++){
//            for(int j=i+1; j<n; j++){
//                count += ((ar[i] + ar[j]) % k == 0) ? 1 : 0;
//            }
//        }





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


//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//import java.io.*;
//import java.net.URL;
//import java.nio.charset.StandardCharsets;
//import java.util.*;
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
//
//                for(int i = 0; i < json.length(); i++) {
//                    JSONObject topping = json.getJSONObject(i);
//
//                    JSONArray ja = topping.getJSONArray("toppings");
//
//                    List<String> topping_names = new ArrayList<>();
//
//                    List<String> same_toppings = new ArrayList<>();
//
//                    for(int j = 0; j < ja.length(); j++) {
//                        String toppingName = ja.getString(j);
//                        topping_names.add(toppingName);
//                    }
//
//                    Collections.sort(topping_names);
//
//
//
//
//
////            System.out.println(topping_names);
////            System.out.println(topping_names.size());
//                    System.out.println(same_toppings);
////            System.out.println(likeItems);
//
//                }
//            }
//        }
//
//
//    }
//}
//
//
//
//
//
//class Node {
//    public int value;
//    public Node left;
//    public Node right;
//
//    public Node(int v) {
//            this.value = v;
//            this.left = null;
//            this.right = null;
//    }
//}
//
//class answers {
//
//    public static void main(String[] args) {
//        printFooBarBaz();
//        System.out.println(reverseCharacters("Tyler is cool."));
//
//        ArrayList<Integer> test = new ArrayList<>();
//        test.add(1);
//        test.add(2);
//        test.add(3);
//        test.add(4);
//        test.add(5);
//        System.out.println(sortedArrayToBST(test).value);
//
//    }
//
////    5 minutes
//    static void printFooBarBaz() {
//        for(int i = 1; i < 100; i++) {
//            if(i % 6 == 0) {
//                System.out.println("baz");
//            } else if(i % 2 == 0) {
//                System.out.println("foo");
//            } else if(i % 3 == 0) {
//                System.out.println("bar");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }
//
////    18 minutes
//    static String reverseCharacters(String input) {
//        String wordList[] = input.split(" ");
//        String reversedWord = "";
//
//        for(String words : wordList) {
//            StringBuilder sb = new StringBuilder(words);
//            sb.reverse();
//            reversedWord += sb.toString() + " ";
//        }
//        return reversedWord;
//    }
//
////    41 minutes
//
//    static Node sortedArrayToBST(ArrayList<Integer> inputList) {
//        return balancedTree(inputList, 0, inputList.size() - 1);
//    }
//
//    static Node balancedTree(ArrayList<Integer> inputList, int left, int right) {
//        if(left > right) {
//            return null;
//        }
//
//        int mid = (left + right) / 2;
//        Node node = new Node(inputList.get(mid));
//        node.left = balancedTree(inputList, left, mid -1);
//        node.right = balancedTree(inputList, mid + 1, right);
//        return node;
//    }
//
//}


//
//// Complete the migratoryBirds function below.
//static int migratoryBirds(List<Integer> arr) {
//        Map<Integer,Integer> map=new TreeMap<>();
//        for(int element:arr){
//        if(!map.containsKey(element)){
//        map.put(element,1);
//        }
//        else{
//        Integer frequency=map.get(element);
//        map.put(element,frequency+1);
//        }
//        }
//        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
//        }

//// Complete the dayOfProgrammer function below.
//static String dayOfProgrammer(int i) {
//        if (i < 1918) {
//        return i%4==0 ? "12.09."+i : "13.09."+i;
//        } else if (i == 1918) {
//        return "26.09."+i;
//        } else {
//        return (i % 4 == 0 && i % 100 != 0)|| i%400 == 0 ? "12.09."+i : "13.09."+i;
//        }
//        }
//
//// Complete the arrayManipulation function below.
//static long arrayManipulation(int n, int[][] queries) {
//        long outputArray[] = new long[n + 2];
//        for (int i = 0; i < queries.length; i++) {
//        int a = queries[i][0];
//        int b = queries[i][1];
//        int k = queries[i][2];
//        outputArray[a] += k;
//        outputArray[b+1] -= k;
//        }
//        long max = getMax(outputArray);
//        return max;
//        }
//
//private static long getMax(long[] inputArray) {
//        long max = Long.MIN_VALUE;
//        long sum = 0;
//        for (int i = 0; i < inputArray.length; i++) {
//        sum += inputArray[i];
//        max = Math.max(max, sum);
//        }
//        return max;
//
//        }


//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//
//        Locale.setDefault(new Locale("en","IN"));
//        String india = NumberFormat.getCurrencyInstance().format(payment);
//        Locale.setDefault(Locale.CHINA);
//        String china = NumberFormat.getCurrencyInstance().format(payment);
//        Locale.setDefault(Locale.US);
//        String us = NumberFormat.getCurrencyInstance().format(payment);
//        Locale.setDefault(Locale.FRANCE);
//        String france = NumberFormat.getCurrencyInstance().format(payment);
//
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
//        }
//        }

//String temp=super.define_me(); //Fix this line


//
//import java.util.*;
//
//
//class Student{}
//class Rockstar{   }
//class Hacker{}
//
//
//public class InstanceOFTutorial{
//
//    static String count(ArrayList mylist){
//        int a = 0,b = 0,c = 0;
//        for(int i = 0; i < mylist.size(); i++){
//            Object element=mylist.get(i);
//            if(element instanceof Student)
//                a++;
//            if(element instanceof Rockstar)
//                b++;
//            if(element instanceof Hacker)
//                c++;
//        }
//        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
//        return ret;
//    }
//
//    public static void main(String []args){
//        ArrayList mylist = new ArrayList();
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for(int i=0; i<t; i++){
//            String s=sc.next();
//            if(s.equals("Student"))mylist.add(new Student());
//            if(s.equals("Rockstar"))mylist.add(new Rockstar());
//            if(s.equals("Hacker"))mylist.add(new Hacker());
//        }
//        System.out.println(count(mylist));
//    }
//}












