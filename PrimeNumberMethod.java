//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrimeNumberMethod {
    /**
     * @param args The method print the first 50 prime number
     */
    public static void main(String[] args) {
        System.out.println("The first prime number are: \n");
        printPrimeNumbers(50);
    }

    /**
     * This method print out the first n prime number
     * @param numberOfPrimes how may prime number to be printed out
     */
    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; //Display 10 per line
        int count = 0; //count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        //Repeatedly find the prime numbers
        while(count < numberOfPrimes){
            //Print the prime number and increase the count
            if(isPrime(number)){
                count++; //increase the count

                if(count % NUMBER_OF_PRIMES_PER_LINE == 0){
                    //Print the number and advance to the new line
                    System.out.printf("%-5d\n", number);
                } else {
                    System.out.printf("%-5d", number);
                }
            }
            // Check if the next number is prime
            number++;
        }
    }

    // Check whether number is prime
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false; // Number is not prime
            }
        }
        return true; // Number is prime
    }
}