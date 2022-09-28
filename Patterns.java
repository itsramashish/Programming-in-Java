/* 
* * * *
* * * *
* * * *
* * * *  
*/
/* import java.util.*;
public class patterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */


/* 
*
* *
* * *
* * * *  
*/
/* import java.util.*;
public class patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            // one line
            for (int star = 1; star <= line; star++) {
                System.out.print("* ");
            }
            // another line
            System.out.println();
        }        
}
}
 */


/* 
* * * *
* * *
* *
* 
*/
/* import java.util.*;
public class patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }     
}
}
 */


/* 
1
1 2
1 2 3
1 2 3 4
 */
/* import java.util.*;
public class patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }     
}
} */


/* 
A
B C
D E F
G H I J 
 */
/* import java.util.*;
public class patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        //outer loop
        for (int line = 1; line <= n; line++) {
            //inner loop
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
}
} */


// Hollow reactangle pattern
/* 
* * * *
*     *
*     *
* * * *
*/
/* import java.util.*;
public class patterns {
    public static void hollowRectangle(int totalRows, int totalCols) {
        for (int i = 1; i <= totalRows; i++) {
            //inner loop
            for (int j = 1; j <= totalCols; j++) {
                // cell - (i,j)
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    //boundry commdition
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        hollowRectangle(rows, cols);
}
} */





// Number pyramid
/* 
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5     */ 
/* 
import java.util.*;
public class patterns {
    public static void numberPyramid(int n){
        // outer loop
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberPyramid(n);
}
}
 */



// Palindromic pattern with number
/* 
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5  */
// outer loop 1 to 5 or we can say 1 to n; n=5
/* 
import java.util.*;
public class patterns {
    public static void palindromicpattern(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // descending loop
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // ascending loop
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palindromicpattern(n); 
}
} */


// Inverted & Rotated half pyramid
/* 
            *
          * *
        * * *
      * * * *
    * * * * *
 */
/* import java.util.*;
public class patterns {
    public static void Inverted_half_Pyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            //Space looop
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Stars loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Inverted_half_Pyramid(n);
    }
} */


// Inverted half pyramid with numbers
/* 
1 2 3 4 5 
1 2 3 4
1 2 3 
1 2 
1
 */
/* import java.util.*;
public class patterns {
    public static void Inverted_half_number_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Inverted_half_number_Pyramid(n);
    }
}
 */


// Floyd's triangle
/* 
1
2 3 
4 5 6 
7 8 9 10
11 12 13 14
 */
/* import java.util.*;
public class patterns {
    public static void Floyds_Triangle(int n) {
        int count = 1;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop - how many time will counter be print
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Floyds_Triangle(n);
    }
} */



// 0-1 Triangle
/*  
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1 
 */
/* import java.util.*;
public class patterns {
    public static void Triangle_0_1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Triangle_0_1(n);
    }
} */



// Butterfly pattern
/* 
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * * 
* *         * * 
*             * 
 */
/* import java.util.*;
public class patterns {
    public static void Butterfly(int n) {
        //outer - 1st half
        for (int i = 1; i <= n; i++) {
            // Stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Spaces - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // Stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Spaces - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Butterfly(n);
    }
} */



// Solid Rhombus
/* 
         * * * * *
       * * * * * 
     * * * * * 
   * * * * *
 * * * * *
 */
/* import java.util.*;
public class patterns {
    public static void Solid_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solid_Rhombus(n);
    }
}
 */


// hollow Rhombus
/* 
         * * * * *
       *       * 
     *       * 
   *       *
 * * * * *
 */
/* import java.util.*;
public class patterns {
    public static void Hollow_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //hollow rhombus - stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hollow_Rhombus(n);
    }
} */


// Diamond pattern
/* 
       *
      * *
     * * *
    * * * *
   * * * * *
   * * * * *
    * * * * 
     * * * 
      * * 
       *
 */
/* import java.util.*;
public class patterns {
    public static void Diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Diamond(n);
    }
} */

 
// Diamond pattern
/* 
        * 
       *** 
      ***** 
     ******* 
     ******* 
      ***** 
       *** 
        *  
*/
/* import java.util.*;
public class patterns {
    public static void Diamond_pattern(int n) {
        // outer looop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 1 || i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // for (int i = n; i >=1; i--) {
        //     // spaces
        //     for (int j = 1; j <= (n - i); j++) {
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Diamond_pattern(n);
    }
}

 */


/* 
       *
      * *
     *   *
    *     *
   *********

       *
      * *
     *   *
    *     *
   *       *
   *       *
    *     *
     *   *
      * *
       *
 */
/* import java.util.*;
public class patterns {
    // public static void Hollow_Triangle(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <= (2 * i) - 1; j++) {
    //             if (i == 1 || i == n || j == 1 || j == (2 * i - 1)) {
    //                 System.out.print("*");
    //             }
    //             else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // Hollow Diamond
    // public static void Hollow_Diamond(int n) {
    //     for (int i = 1; i <= n; i++) {
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <= (2 * i) - 1; j++) {
    //             if (i == 1 || j == 1 || j == (2 * i - 1)) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = 1; j <= n - i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <= (2 * i) - 1; j++) {
    //             if (i == 1 || j == 1 || j == (2 * i - 1)) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Hollow_Triangle(n);
        // Hollow_Diamond(n);
    }
} */


























