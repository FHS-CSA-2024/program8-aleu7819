//import stuff here
import java.util.Scanner;
//Your code here
public class Program8 {
    public static void main (String[] args) {
        
        Scanner numScanner = new Scanner(System.in);
        
        System.out.println("enter integer 1");
        int integer1 = numScanner.nextInt();
        
        System.out.println("enter integer 2");
        int integer2 = numScanner.nextInt();
        
        int sum = integer1 + integer2;
        int difference = integer1 - integer2;
        int product = integer1 * integer2;
        double average = (integer1+integer2)/2;
        int distance = Math.abs(integer1 - integer2) + integer1 + integer2;
        int maximum = 0;
        int minimum= 0;
        
        if (integer1 > integer2) {
            maximum = integer1;
            minimum = integer2;
        }
        else {
            maximum = integer2;
            minimum = integer1;
        }
        
        System.out.println("original numbers are " + integer1 + " and " + integer2);
        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("average = " + average);
        System.out.println("absolute value = " + distance);
        System.out.println("maximum = " + maximum);
        System.out.println("minimum = " + minimum);
        
    }
}
//Paste console output below:
/*

enter integer 1
13
enter integer 2
20
original numbers are 13 and 20
sum = 33
difference = -7
product = 260
average = 16.0
absolute value = 40
maximum = 20
minimum = 13


*/
