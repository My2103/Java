//PrimeNumber.java:  a program that displays the first 50 prime numbers in five lines,
// each of which contains 10 numbers. An integer greater than 1 is prime if its only positive divisor is 1 or itself.
// For example, 2, 3, 5, and 7 are prime numbers, but 4, 6, 8, and 9 are not.
public class PrimeNumber {
    public static void main(String[] args) {
       final int NUMBER_OF_PRIMES = 50; //Number of Prime to display
       final int NUMBER_OF_PRIMES_PER_LINE = 10; //Display 10 per lines
       int count = 0; //Declare the variable count
         int number = 2; //A number to test for primeness

       //Print the title
       System.out.println("The first 50 prime numbers are ");
       System.out.println();

       //Start the loop to check and print the prime number
       while (count < NUMBER_OF_PRIMES) {
           boolean isPrime = true;

           //check if number is prime or not
           for (int divisor = 2 ; divisor <= Math.sqrt(number); divisor++) {
               if (number % divisor == 0) {
                   isPrime = false;
                   break; //(divisor <= Math.sqrt(number)) || !isPrime (don't need break if write like this)
                         //hạn chế dùng break
               }
           }

           //Print the 50 prime number
           if (isPrime){
               System.out.print(number + " ");
               count++; //increase the count to 50
               if(count % NUMBER_OF_PRIMES_PER_LINE == 0){
                   System.out.println();
               }
           }
           number++;
       }
    }
}