/* WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative */
/* import java.util.*;
public class conditionalquestion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 0) {
            System.out.println("Entered number is positive");

        }
        else {
            System.out.println("Entered number is negative");
        }
    }
} */


/* 
FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis above 100 and otherwise prints You don't have a feve */

/* 
import java.util.*;
public class conditionalquestion {
    public static void main(String args[]) {
        double temp = 103.5;
        if (temp > 100) {
            System.out.println("You have fever");
        }
        else {
            System.out.println("You don't have fever");
        }
    }
} */



/* WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case */
/* 
import java.util.*;
public class conditionalquestion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input!!");
                break;
        }        
}
} */

/* 
What will be the value of x & y in thefollowing program */
/* 
public class conditionalquestion {
    public static void main(String args[]) {
        int a = 63 , b = 36;
        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;
        System.out.println(x);  // output:: false
        System.out.println(y);  // output:: a
    }
} */


/* Write a Java program that takes a year from the user and print whether that year is a leap year or not. */
/* import java.util.*;

public class conditionalquestion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 100 != 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
 */
/* 
import java.util.*;
public class conditionalquestion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } 
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
 */




