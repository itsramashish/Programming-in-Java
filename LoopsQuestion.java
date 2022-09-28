
/* Write a program that reads a set of integers,and then prints the sum of the even and odd integers. */
/* import java.util.*;
public class loopsquestions {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum_even = 0;
      int sum_odd = 0;
      System.out.print("Numbers from 1 to " + n + ": ");
      for (int i = 1; i <= n; i++) {
        System.out.print(i + " ");
        if (i % 2 == 0) {
          sum_even += i;
        } else {
          sum_odd += i;
        }
      }
      System.out.println("\nSum of even numbers: " + sum_even);
      System.out.println("Sum of odd numbers: " + sum_odd);
}
} */



/* write a program to find the factorial of any number entered by the user. */
/* import java.util.*;
public class loopsquestions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("Factorial of given number: " + fact);  
}
} */


/* Write a program to print the multiplication table of a number N, entered by the user. */
/* import java.util.*;
public class loopsquestions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
} */






