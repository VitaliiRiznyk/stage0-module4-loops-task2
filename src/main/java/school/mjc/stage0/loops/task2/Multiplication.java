package school.mjc.stage0.loops.task2;

public class Multiplication {
    public  void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        int res = 0;
        if (multiplyByAndToInclusive < 0) {
            while (i <= multiplyByAndToInclusive * -1) {
                System.out.println(res = i * multiplyByAndToInclusive);
                i++;
            }
        } else if (multiplyByAndToInclusive > 0) {
            while (i <= multiplyByAndToInclusive) {
                System.out.println(res = i * multiplyByAndToInclusive);
                i++;
            }
        }
    }
}