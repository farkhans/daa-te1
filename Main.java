import java.util.Random;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();
        PrintStream o = new PrintStream(new File("100k.txt"));
        System.setOut(o);
        for (int i = 0; i < 100000; i++) {
            System.out.println(random.nextInt(1001));
        }
    }
}
