/** @author Lilla T. Varnedoe
 *  FizzBuzz Program 1 CS251L
 *  This program accepts 3 values from the command line, 2 divisors and 1 limit.
 *  It checks to see if each number starting at one and going to the limit is divisible
 *  by the divisors. If it is only divisible by the first number entered, the word Fizz will print to the screen.
 *  If it is only divisible by the second number entered, the word Buzz will print to the screen.
 *  If the number is divisible by both the first and the second number, the word FizzBuzz will print to the screen.
 *  Finally, if the number is not divisible by either number entered, then the number will print to the screen.
 *  To play, at the command prompt enter java FizzBuzz followed by 3 positive numbers separated by a space ex. java FizzBuzz 2 5 10
 */

import java.lang.Integer;

public class FizzBuzz {
    //variables to be assigned the command line entries, static because they don't change and private because they are only being used within the class
    private static int fizz, buzz, limit;

    public static void main(String[] args) {
        //convert command line arguments from Strings to Integers and assign the values to the named variables fizz, buzz, and limit
        fizz = Integer.parseInt(args[0]);
        buzz = Integer.parseInt(args[1]);
        limit = Integer.parseInt(args[2]);

        //the value of limit determines how many times the code is looped through
        for (int i = 1; i <= limit; i++) {
            //if i is divisible by the value of fizz and the value of buzz, then FizzBuzz will print
            if (((i % fizz) == 0) && ((i % buzz) == 0)) {
                System.out.println("FizzBuzz");
            }
            //if i is only divisible by the value of fizz, then Fizz will print
            else if ((i % fizz) == 0){
                System.out.println("Fizz");
            }
            //if i is only divisible by the value of buzz, then Buzz will print
            else if((i % buzz) == 0){
                System.out.println("Buzz");
            }
            //if i is not divisible by the value of fizz or the value of buzz, then the value of i will print
            else{
                System.out.println(i);}
        }
    }
}