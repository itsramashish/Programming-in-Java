// Write a java method to compute the average of three numbers.
/* import java.util.*;
public class functions_questions {
    public static void Average(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println("Average is: " + avg);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Average(a, b, c);
    }
}
 */


// Write a method named isEven that accepts an int argument. The method should return true if argument is even, or false otherwie. Also write a program to test your method.
/* import java.util.*;
public class functions_questions {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEven(n));
}
} */



// Write a Java program to check if a number is a palindrome in java? 
/* A number is called palindrome if the number is equal to the reverse of a number e.g. 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321. */
/* import java.util.*;
public class functions_questions {
    public static boolean is_Palindrome(int n) {
        int myNum = n;
        int palindrome = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            palindrome = (palindrome * 10)+  lastdigit;
            n /= 10;
        }
        if (palindrome == myNum) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(is_Palindrome(n));
        if (is_Palindrome(n)) {
            System.out.println("Number : " + n + " is a palindrome");
        } else {
            System.out.println("Number : " + n + " is not a palindrome");
        }
}
} */

// Same as above 
/* 
import java.util.Scanner;
public class functions_questions {
    public static void main(String args[]) {
        System.out.println("Please Enter a number :");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }
    }
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        // if original and the reverse of number is equal means number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        else {
            return false;
        }
    }
} */



// Write a Java method to compute the sum of the digits in an integer.
/* import java.util.*;
public class functions_questions {
    public static int Sumofdigits(int n) {
        int sum = 0;
        while (n != 0) {
            int lastdigit = n % 10;
            sum += lastdigit;
            n /= 10;

        }
        return sum; 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int digits = sc.nextInt();
        System.out.println("Sum of given digits: " + Sumofdigits(digits));
    }
}
 */






































