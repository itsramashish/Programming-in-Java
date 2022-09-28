// import java.util.*;
// public class variable_question {
//     public static void main(String args[]) {

//     }   
// }


// Average of given 3 numbers
/* import java.util.*;
public class variable_questions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println("Average of given numbers:: " + avg);    
}
}
 */

/* 
Enter cost of 3 items from the user(using float datatype)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
/* import java.util.*;
public class variable_questions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float totalcost = (pencil + pen + eraser);
        
        System.out.println("Bill is: " + totalcost);

        // Add on - with 18% tax

        float newTotal = totalcost + (0.18f * totalcost);
        
        System.out.println("Bill with 18% tax: " + newTotal);
}
} */



// What will be the type of result in thefollowing Java code?
/* import java.util.*;
public class variable_questions {
    public static void main(String args[]){
         byte b = 4;
         char ch = 'a';
         short s = 512;
         int i = 1000;
         float f = 3.14f;
         double d = 99.9954;
         double result = (f * b) + (i % ch) - (d * s);
         System.out.println(result);

         // Output will be in double form;
}
}
 */


// In a program,input the side of a square.You have to output the area of the square
/* import java.util.*;
public class variable_questions {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int side = sc.nextInt();
            int area = side * side;
            System.out.println("Area is: " + area);
        }
    }
} */



//(Advanced) Will the following statementgive any error in Java? int $ = 24;
// NO it will provide you perfect output no error will generate.
/* Names of variable are called identifiers in Java.Identifier rule says,identifiers can start with any alphabet or underscore (_) or dollar ($).According to the rule the given variable name is a valid identifier. */








