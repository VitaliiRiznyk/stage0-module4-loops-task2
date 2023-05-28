package school.mjc.stage0.loops.task2;

import java.math.BigInteger;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;
        while (i < printToInclusive) {
            if (new BigInteger(String.valueOf(i)).isProbablePrime(10)) {
                System.out.println(i);
            }
            i++;
        }
    }

}