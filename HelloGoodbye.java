import edu.princeton.cs.algs4.Stdout;

public class HelloGoodbye {
    public static void main(String[] args) {
        if (args.length == 2) {
            Stdout.println("Hello " + args[0] + " " + args[1] + ".");
            Stdout.println("Goodbye " + args[1] + " " + args[0] + ".");
        } else {
            Stdout.println("Usage: java HelloGoodbye <first_name> <last_name>");
        }
    }
}