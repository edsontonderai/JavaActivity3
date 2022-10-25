package Activity3;

import java.util.ArrayList;

public class Qn3 {
    public static void main(String [] args){
        //A prime number has on two factors - 1 and the number itself
        ArrayList <Integer> primeNumbers = new ArrayList<>();
        for( int p = 2; p <=100; p++){

            boolean isPrime = true;
            for(int factor = 2; factor < p; factor++){
                if(p%factor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeNumbers.add(p);
            System.out.println("Prime numbers from 1to 100 are " );
            for (int number:primeNumbers){
                System.out.println(number);

            }


            }

        }
    }
}
