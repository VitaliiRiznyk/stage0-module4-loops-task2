package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public  void buildPhrase(char... chars) {
        StringBuilder stringBuilder = new StringBuilder(chars.length);
        int i = 0;
        while (i < chars.length) {
            stringBuilder.append(chars[i]);
            i++;
        }
        System.out.print(stringBuilder.toString());
    }
}