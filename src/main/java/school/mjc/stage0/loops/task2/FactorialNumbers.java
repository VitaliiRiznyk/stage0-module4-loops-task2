package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int res = 1;
        while (i <= printToInclusive) {
            if (printToInclusive == 0 || i==0) {
                System.out.println("1");
            } else {
                System.out.println(res *= i);
            }
            i++;
        }
    }

}