import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random(123);
        long start = System.currentTimeMillis();
        String s = "";

        for (int i = 0; i < 77778; i++) {
            s += r.nextInt();
        }

        System.out.println(System.currentTimeMillis() - start);

        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 77778; i++) {
            sb.append(r.nextInt(2));
        }

        s = sb.toString();
        System.out.println(System.currentTimeMillis() - start);
        System.out.println("Bui Quang Phuong 20235809");
    }
}