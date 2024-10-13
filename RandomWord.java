

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champ = "";
        int i = 1;
        while (!StdIn.isEmpty()) {
            String value = StdIn.readString();
            boolean flag = StdRandom.bernoulli((double) 1 / i);
            if (flag) {
                champ = value;
            }
            i++;
        }
            StdOut.println(champ);

    }
}
