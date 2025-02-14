//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonteCarloSimulation {
    public static void main(String[] args) {
       final int NUMBER_OF_TRIALS = 2000000000;
       int numberOfHits = 0;

       for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
           double x = Math.random()*2-1;
           double y = Math.random()*2-1;

           if(x*x + y*y <= 1){
               numberOfHits++;
           }
       }
       double pi = 4.0 *numberOfHits/NUMBER_OF_TRIALS;

       System.out.println("Number of hits: " + numberOfHits);
        System.out.println("Pi is: " + pi);
    }
}
