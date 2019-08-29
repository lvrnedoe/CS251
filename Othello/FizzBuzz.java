import java.lang.Integer;

public class FizzBuzz {
    private static int fizz, buzz, limit;

    public static void main(String[] args) {
        fizz = Integer.parseInt(args[0]);
        buzz = Integer.parseInt(args[1]);
        limit = Integer.parseInt(args[2]);
        //System.out.println(fizz);
        //System.out.println(buzz);
        //System.out.println(limit);

        //multiples of a = fizz
        //multiples of b = buzz
        //upper limit c = limit;

        for (int i = 1; i <= limit; i++) {
            if (((i % fizz) == 0) && ((i % buzz) == 0)) {
                System.out.println("FIZZBUZZ");
            }
            else if ((i % fizz) == 0){
                System.out.println("FIZZ");
            }
            else if((i % buzz) == 0){
            //System.out.println(fizz);
                System.out.println("BUZZ");
            }
            else{
                System.out.println(i);}
        }
    }
}


