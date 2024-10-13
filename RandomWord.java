import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.Stdout;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        int i = 1;
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            boolean flag = StdRandom.bernoulli(1.0 / i);
            if (flag) {
                champion = word;
            }
            i++;
        }
        Stdout.println(champion);
    }
}