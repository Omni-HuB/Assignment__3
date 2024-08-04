// Java program to read a matrix from user

import java.util.*;

public class __Main__ {
   static int m, n, i, j;
   static Scanner in;
    // Function to read matrix
    public static void matrixByUser() {

        try {
            in = null;
            in = new Scanner(System.in);
            System.out.print("Enter the number "
                    + "of rows of the matrix  ");
            m = in.nextInt();
            System.out.print("Enter the number "
                    + "of columns of the matrix  ");
            n = in.nextInt();
            int[][] first = new int[m][n];

            // Read the matrix values
            System.out.println("Enter the elements of the matrix");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    // System.out.print("");
                    first[i][j] = in.nextInt();
                }
                System.out.println();
            }

            // Display the elements of the matrix
            System.out.println("Elements of the matrix are");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print((double) first[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
        }
    }

    public static void matrix(){

            try{ // Declare the matrix

               // Random rand=new Random();
                in = null;
                in = new Scanner(System.in);
                System.out.print("Enter the number "
                        + "of rows of the matrix  ");
                m = in.nextInt();
                System.out.print("Enter the number "
                        + "of columns of the matrix  ");
                n = in.nextInt();
                int[][] first = new int[m][n];

                // Display the elements of the matrix
                System.out.println("Elements of the matrix are");
                for (i = 0; i < m; i++) {
                    for (j = 0; j < n; j++) {
                        double rand=Math.random();
                        first[i][j] = (int)(rand*100);

                        System.out.print((double) first[i][j] + " ");
                    }
                    System.out.println();
                }
        }
        catch(Exception e){
             }

        }




    // Driver code
    public static void main(String[] args)
    {

        //matrixByUser();
        matrix();
    }

}
