// A program that uses nested for loops to print a multiplication table.
public class MultiplicationTable {
    public static void main(String[] args) {
        //Display the table heading
        System.out.println("           Multiplication Table");

        //Display the number title
        //       1   2   3   4   5   6   7   8   9
        System.out.print("    ");
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println("\n-----------------------------------------");

        //Print the table body
        for(int i = 1; i <= 9; i++) { //loop by the row
            //print each row. For ex:
            //1 |       1   2   3   4   5   6   7   8   9
            System.out.print(i +" | ");
           for(int j = 1; j <= 9; j++) {
               //Display the product and align properly
               System.out.printf("%4d", i * j); //each number takes up 4 characters
           }
            System.out.println();
        }
    }
}