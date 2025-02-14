//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FutureTuition {
    public static void main(String[] args) {
       //Declare the tuition and the year
        double tuition = 10000;
        int year = 0;

        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("Tuition will be double in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
    }
}