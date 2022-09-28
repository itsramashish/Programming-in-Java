// printing hello world using function
/* public class functions {
    public static void printHelloWorld() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return;
    }
    public static void main(String args[]) {
        printHelloWorld();  // function call
    }
}
 */


// printing sum of two numbers using function
/* import java.util.*;
public class functions {
    public static int calculateSum(int a, int b) {  // parameters or formal parameters
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a , b);     // arguments or actual parameters
        System.out.println("Sum of a and b: " + sum);
}
} */


// function call (call by value)
/* import java.util.*;
public class functions {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Swap - values exchange
        int a = 5;
        int b = 10;
        // Swap
        swap(a, b);
}
} */
// no call by reference in Java

// find product of a and b using function
/* import java.util.*;
public class functions {
    public static int Multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = Multiply(a, b);
        System.out.println("Product of a and b: " + product);
}
}
 */


// factorial of a number, n;
/* import java.util.*;
public class functions {
    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = Factorial(n);
        System.out.println("Factorial is: " + fact);
}
} */


// finding binomial coefficient
/* import java.util.*;
public class functions {
    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int binCoeff(int n, int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int fact = Factorial(n);
        int binCoeff = binCoeff(n, r);
        System.out.println("Factorial of n is: " + fact);
        System.out.println("Value of binomial coefficient is: " + binCoeff);
}
} */


// Function overloading using parameters
/* public class functions {
    //func to clac sum of 2 nums
    public static int sum(int a, int b) {
        return a + b;
    }
    // func to clac sum of 3 nums
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String args[]) {
        System.out.println(sum(3, 5));
        System.out.println(sum(2 , 5 , 8));
    }
}

 */


// function overloading using datatypes
/* import java.util.*;
public class functions {
    // function to calc int sum
    public static int sum(int a, int b) {
        return a + b;
    }
    public static float sum(float a, float b) {
        return a + b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(5, 8));
        System.out.println(sum(5.2f , 7.8f));
}
}
 */


// check if a number is prime or not 
/* import java.util.*;
public class functions {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean Prime = isPrime(n);
        System.out.println(Prime);
}
} */


// check if a number is prime or not
/* import java.util.*;
public class functions {
    // only for n>=2
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
}
} */


// optimized approach for prime number
/* import java.util.*;
public class functions {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
}
} */


// Print all prime numbers in a Range
/* import java.util.*;
public class functions {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimeInRange(n);
}
}
 */



// Convert from binary to decimal
/* import java.util.*;
public class functions {
    public static void binTodec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }
        System.out.println("decimal of "+myNum+" = "+decNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        binTodec(binNum);
}
} */


// convert decimal to binary
/* import java.util.*;
public class functions {
    public static void decTobin(int n) {
        int myNum = n;
        int binNum = 0;
        int pow = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.println("Binary form of " + myNum + " = " + binNum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decTobin(n);
    }
}
 */















