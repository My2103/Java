//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestSum {
    final static double INCR = 0.01;
    public static void main(String[] args) {
        //Initialize sum
        double sum = 0;

        //Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (double i = 0.01; i <= 1.0f; i += INCR) {
            System.out.println(i);
            sum += i;
        }

        //Display result
        System.out.println("The sum is " + sum);
        System.out.println(0.01f);
        System.out.println(0.01f < 0.01); //It means the 0.01f < 0.01 always true, it not equal
    }
}